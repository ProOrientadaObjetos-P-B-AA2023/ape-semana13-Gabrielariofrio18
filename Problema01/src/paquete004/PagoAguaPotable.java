
package paquete004;

import paquete001.Persona;

/**
 *
 * @author reroes
 */
public class PagoAguaPotable extends Pago {
    String tipo;
    public double tarifaFija;
    public double metrosCubicosConsumo;
    public double costoConsumoCubicos;
    public PagoAguaPotable(double pago,  double tarifaFija,double metrosCubicosConsumo, double costoConsumoCubicos) {
        super(pago);
        this.tipo = tipo;
    }

    public void calcularPago(){
        double pago = 0;
        if(tipo.equals("comercial")){
            double tarifaFija = 2.20;
            double metrosCubicosConsumo = 100.2;
            double costoConsumoCubicos = 0.2;
            super.pago = tarifaFija + (metrosCubicosConsumo * costoConsumoCubicos) + 15;
        }else{
            double tarifaFija = 2.20;
            double metrosCubicosConsumo = 100.2;
            double costoConsumoCubicos = 0.2;
            super.pago = tarifaFija + (metrosCubicosConsumo * costoConsumoCubicos);
        }
    }

    @Override
    public String toString() {
        return "PagoAguaPotable{" +
                "tipo='" + tipo + '\'' +
                ", tarifaFija=" + tarifaFija +
                ", metrosCubicosConsumo=" + metrosCubicosConsumo +
                ", costoConsumoCubicos=" + costoConsumoCubicos +
                '}';
    }
}