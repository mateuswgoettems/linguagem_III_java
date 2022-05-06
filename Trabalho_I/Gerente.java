import java.util.Date;

public class Gerente extends Funcionario {
    String area;

    Gerente(String area, Date nascimento, String name, double salario) {
        super(nascimento, name, salario);
        this.area = area;
    }

    public double calculaImposto() {
        return salario * 0.05;
    }

    public void imprimeDados() {
        super.imprimeDados();
        System.out.println("Area:" + this.area);
    }
}
