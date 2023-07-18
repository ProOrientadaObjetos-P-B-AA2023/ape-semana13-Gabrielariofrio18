package OCP_Principio;
public class TipoMatricula {
    private double promedioMatriculas;
    private Matricula matricula1;
    private Matricula matricula2;

    public void establecerMatricula1(Matricula matricula) {
        matricula1 = matricula;
    }
    public void establecerMatricula2(Matricula matricula) {
        matricula2 = matricula;
    }
    public Matricula obtenerMatricula1() {
        return matricula1;
    }
    public Matricula obtenerMatricula2() {
        return matricula2;
    }
    public void establecerPromedioTarifas() {
        promedioMatriculas = (obtenerMatricula1().obtenerTarifa() +
                obtenerMatricula2().obtenerTarifa()) / 2;
    }
    public double obtenerPromedioTarifas() {
        return promedioMatriculas;
    }
    @Override
    public String toString() {
        return "TipoMatricula{" +
                "promedioMatriculas=" + promedioMatriculas +
                ", matricula1=" + matricula1 +
                ", matricula2=" + matricula2 +
                '}';
    }
}
