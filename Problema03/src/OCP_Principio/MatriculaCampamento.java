package OCP_Principio;
public class MatriculaCampamento implements Matricula {
    @Override
    public double obtenerTarifa() {
        // tarifa = costo transporte + costo comida + costo instructores
        return 100.2 + 30.2 + 90.2;
    }
}