
package paquete004;

import paquete001.Persona;


public class PagoTelefonoConvencional extends Pago  {
    public double tarifa;
    public double minutosConsumidos;
    public double costoMinuto;

    public PagoTelefonoConvencional(double pago, double tarifa, double minutosConsumidos, double costoMinuto) {
        super(pago);
        this.tarifa = tarifa;
        this.minutosConsumidos = minutosConsumidos;
        this.costoMinuto = costoMinuto;
    }

    public void calcularPago(){
        super.pago = tarifa + (minutosConsumidos * costoMinuto);
    }

    @Override
    public String toString() {
        return "PagoTelefonoConvencional{" +
                "tarifa=" + tarifa +
                ", minutosConsumidos=" + minutosConsumidos +
                ", costoMinuto=" + costoMinuto +
                '}';
    }
}
