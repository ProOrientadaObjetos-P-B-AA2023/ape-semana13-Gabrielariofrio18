package OCP_Principio;
public class MatriculaColegio implements Matricula {
    private double tarifa;
    public void establecerTarifa(){
        // tarifa = costo deportes + costo folletos +
        //          costo uniformes + costo laboratorios
        tarifa = 150.2 + 140.2 + 240.2 + 300.4;
    }
    public double obtenerTarifa(){
        return tarifa;
    }
}
