/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paquete005;

import paquete001.Persona;
import paquete002.Ciudad;
import paquete002.Propiedad;
import paquete003.BilleteraPagos;
import paquete004.*;
import paquete006.DatosAgua;
import paquete006.DatosLuz;
import paquete006.DatosPropiedades;
import paquete006.DatosTelefono;

import java.util.ArrayList;
import java.util.List;

public class Principal {
    public static void main(String[] args) {
        Ciudad ciudad = new Ciudad("Loja");
        Persona persona = new Persona("Ana","Perez",18,112333,ciudad);


        double [][] datosAguasCasas = DatosAgua.datosCasas();
        double [][] datosAguaComerciales = DatosAgua.datosComerciales();
        double [][] datosLuzCasa = DatosLuz.datosLoja();
        double [][] datosLuzComercio = DatosLuz.datosGeneral();
        double [][] datosCasa1 = DatosPropiedades.datos();
        double [][] datosTelefonoCasa = DatosTelefono.datos();
        List<Pago> pagos = new ArrayList<>();
        for (double[] datos1 : datosAguasCasas) {
            double tarifa = datos1[1];
            double metrosCubicosConsumo = datos1[2];
            double costoConsumoCubicos = datos1[3];

            PagoAguaPotable pagoAgua = new PagoAguaPotable(0,tarifa, metrosCubicosConsumo, costoConsumoCubicos);
            pagos.add(pagoAgua);
        }
        for (double[] datos2 : datosAguaComerciales) {
            double tarifa = datos2[1];
            double metrosCubicosConsumo = datos2[2];
            double costoConsumoCubicos = datos2[3];

            PagoAguaPotable pagoAgua = new PagoAguaPotable(0,tarifa, metrosCubicosConsumo,costoConsumoCubicos);
            pagos.add(pagoAgua);

        }
        for (double[] datos3 : datosLuzCasa) {
            double tarifaBase = datos3[1];
            double kilovatiosConsumidos = datos3[2];
            double costoKilovatio = datos3[3];
            PagoLuzElectrica pagoLuzElectrica = new PagoLuzElectrica(0,tarifaBase,kilovatiosConsumidos,costoKilovatio);
            pagos.add(pagoLuzElectrica);
        }
        for (double[] datos4 : datosLuzComercio ) {
            double tarifaBase = datos4[1];
            double kilovatiosConsumidos = datos4[2];
            double costoKilovatio = datos4[3];
            PagoLuzElectrica pagoLuzElectrica = new PagoLuzElectrica(0,tarifaBase,kilovatiosConsumidos,costoKilovatio);
            pagos.add(pagoLuzElectrica);
        }
        for (double[] datos5 : datosCasa1) {
            double valorPropiedad = datos5[1];
            double porcentaje = datos5[2];

            PagoPredial pagoPredial = new PagoPredial(0,valorPropiedad,porcentaje);
            pagos.add(pagoPredial);
        }
        for (double[] datos6 :datosTelefonoCasa) {
            double tarifa = datos6[1];
            double minutosConsumidos = datos6[2];
            double costoMinuto = datos6[3];

            PagoTelefonoConvencional pagoTelefonoConvencional = new PagoTelefonoConvencional(0,tarifa,minutosConsumidos,costoMinuto);
            pagos.add(pagoTelefonoConvencional);
        }

        Propiedad propiedad = new Propiedad(1500);
        BilleteraPagos pago = new BilleteraPagos(persona,0.0,pagos,"Mayo");
        pago.calcularGastoTotalPagos();
        System.out.println(pago);

    }
}