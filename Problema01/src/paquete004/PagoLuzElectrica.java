
package paquete004;

import paquete001.Persona;


public class PagoLuzElectrica extends Pago {
    public double tarifaBase;
    public double kilovatiosConsumidos;
    public double costoKilovatio;

    public PagoLuzElectrica(double pago, double tarifaBase, double kilovatiosConsumidos, double costoKilovatio) {
        super(pago);
        this.tarifaBase = tarifaBase;
        this.kilovatiosConsumidos = kilovatiosConsumidos;
        this.costoKilovatio = costoKilovatio;
    }

    public void calcularPago() {
        double tarifaBase = 10.20;
        double kilovatiosConsumidos = 80;
        double costoKilovatio = 0.5;
        String ciudad = "Loja";
        if (ciudad.equals("Loja")) {
            super.pago = tarifaBase + (kilovatiosConsumidos * costoKilovatio / 2);
        } else {
            super.pago = tarifaBase + (kilovatiosConsumidos * costoKilovatio);
        }
    }

    @Override
    public String toString() {
        return "PagoLuzElectrica{" +
                "tarifaBase=" + tarifaBase +
                ", kilovatiosConsumidos=" + kilovatiosConsumidos +
                ", costoKilovatio=" + costoKilovatio +
                '}';
    }
}
