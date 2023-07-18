package SRP_Principio;
import java.util.ArrayList;
import paquete01.Televisor;
public class MarcasVendidas {
    public String obtenerMarcas(ArrayList<Televisor> televisores) {
        StringBuilder marcas = new StringBuilder();
        for (Televisor televisor : televisores) {
            marcas.append(televisor.obtenerMarca()).append("\n");
        }
        return marcas.toString();
    }
}
