package paquete003;

import paquete001.Persona;
import paquete004.*;

import java.util.List;

/**
 *
 * @author reroes
 */
public class BilleteraPagos {
    public Persona persona;
    public double gastoPagos;
    public List<Pago> pagos;
    public String mes;

    public BilleteraPagos(Persona persona, double gastoPagos, List<Pago> pagos, String mes) {
        this.persona = persona;
        this.gastoPagos = gastoPagos;
        this.pagos = pagos;
        this.mes = mes;
    }

    public double calcularGastoTotalPagos() {
        for (Pago pago : pagos)
            gastoPagos = gastoPagos + pago.Pago;
        return gastoPagos;
    }

    @Override
    public String toString() {
        return "BilleteraPagos{" +
                "\n persona: " + persona +
                "\n gastoPagos " + gastoPagos +
                "\n  pagos " + pagos +
                "\n  mes " + mes;
    }
}
