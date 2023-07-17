
package paquete004;

import paquete001.Persona;
import paquete002.Propiedad;

/**
 *
 * @author reroes
 */
public class PagoPredial extends Pago  {
    public double valorPropiedad;
    public double porcentaje;

    public PagoPredial(double pago, double valorPropiedad, double porcentaje) {
        super(pago);
        this.valorPropiedad = valorPropiedad;
        this.porcentaje = porcentaje;
    }

    public void calcularPago(){
        super.pago = valorPropiedad - ((valorPropiedad*porcentaje)/100);
    }

    @Override
    public String toString() {
        return "PagoPredial{" +
                "valorPropiedad=" + valorPropiedad +
                ", porcentaje=" + porcentaje +
                '}';
    }
}