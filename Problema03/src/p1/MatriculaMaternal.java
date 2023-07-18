
package p1;
public class MatriculaMaternal {
    private double tarifa;
    public void establecerTarifa(){
        // tarifa = costo desayunos + costo almuerzo + costo medico
        tarifa = 50.2 + 40.2 + 80.2;
    }
    public double obtenerTarifa(){
        return tarifa;
    }
}