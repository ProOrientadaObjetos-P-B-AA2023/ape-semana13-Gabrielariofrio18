package SRP_Principio;
import java.util.ArrayList;
import paquete01.Televisor;
public class VentasTvs {
    private ArrayList<Televisor> televisores;
    public void establecerTelevisores(ArrayList<Televisor> t) {
        televisores = t;
    }
    public ArrayList<Televisor> obtenerTelevisores() {
        return televisores;
    }
    public double calcularPrecioTotal() {
        double precioTotal = 0;
        for (Televisor televisor : televisores) {
            precioTotal += televisor.obtenerPrecio();
        }
        return precioTotal;
    }
}
