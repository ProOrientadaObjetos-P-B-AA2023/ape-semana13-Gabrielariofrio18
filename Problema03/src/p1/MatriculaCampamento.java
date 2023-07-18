
package p1;
public class MatriculaCampamento {
    private double tarifa;
    public void establecerTarifa(){
        // tarifa = costo transporte + costo comida + costo instructores
        tarifa = 100.2 + 30.2 + 90.2;
    }
    public double obtenerTarifa(){
        return tarifa;
    }
}
