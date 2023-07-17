package paquete001;
import paquete002.Ciudad;
public class Persona {
    String nombre;
    String apellido;
    int edad;
    double cedula;
    public Ciudad ciudad;

    public Persona(String nombre, String apellido, int edad, double cedula, Ciudad ciudad) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
        this.cedula = cedula;
        this.ciudad = ciudad;
    }

    @Override
    public String toString() {
        return "" +
                "\n nombre" + nombre +
                "\n apellido" + apellido  +
                "\n edad" + edad +
                "\n cedula" + cedula +
                "\n ciudad" + ciudad;
    }
}
