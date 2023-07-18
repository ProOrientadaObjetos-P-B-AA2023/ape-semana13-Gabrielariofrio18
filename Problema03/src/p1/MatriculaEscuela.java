
package p1;
public class MatriculaEscuela {
    private double tarifa;
    public void establecerTarifa(){
        // tarifa = costo libros + costo deportes + costo folletos + 
        //          costo uniformes
        tarifa = 50.2 + 40.2 + 140.2 + 200.4;
    }
    public double obtenerTarifa(){
        return tarifa;
    }
}
