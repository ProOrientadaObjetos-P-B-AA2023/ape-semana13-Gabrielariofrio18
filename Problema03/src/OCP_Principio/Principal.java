package OCP_Principio;
public class Principal {
    public static void main(String[] args) {
        TipoMatricula tipos = new TipoMatricula();
        MatriculaCampamento mcamp = new MatriculaCampamento();
        MatriculaColegio mcolegio = new MatriculaColegio();
        tipos.establecerMatricula1(mcamp);
        tipos.establecerMatricula2(mcolegio);
        tipos.establecerPromedioTarifas();
        System.out.printf("%s\n", tipos);
    }
}
