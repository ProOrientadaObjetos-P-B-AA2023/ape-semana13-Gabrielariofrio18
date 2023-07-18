package SRP_Principio;
public class Televisor {
    private String marca;
    private double precio;
    public void establecerMarca(String m) {
        marca = m;
    }
    public void establecerPrecio(double p) {
        precio = p;
    }
    public String obtenerMarca() {
        return marca;
    }
    public double obtenerPrecio() {
        return precio;
    }
    @Override
    public String toString() {
        return String.format("TV:%s\n%s\n",
                obtenerMarca(),
                obtenerPrecio());
    }
}
