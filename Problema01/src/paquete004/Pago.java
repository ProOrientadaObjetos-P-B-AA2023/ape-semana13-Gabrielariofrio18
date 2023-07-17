package paquete004;

import paquete006.DatosAgua;

public abstract class Pago {
    public double Pago;
    protected double pago;

    public Pago(double pago) {
        Pago = pago;
    }

    abstract public void calcularPago();

    @Override
    public String toString() {
        return "Pago{" +
                "Pago=" + Pago +
                ", pago=" + pago +
                '}';
    }
}
