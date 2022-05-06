import java.util.Date;

public class Funcionario extends Pessoa {
    public double salario;

    Funcionario(Date nascimento, String nome, double salario) {
        super(nome, nascimento);
        this.salario = salario;
    }

    public double calculaImposto() {
        return salario * 0.03;
    }

    public void imprimeDados() {
        System.out.println("Nome:" + this.name);
        System.out.println("Data de Nascimento:" + nascimento);
        System.out.println("Salário:" + this.salario);
    }
}
