import java.util.Date;

public abstract class Pessoa {
    public String name;
    public Date nascimento;

    Pessoa(String name, Date nascimento) {
        this.name = name;
        this.nascimento = nascimento;
    }

    public abstract void imprimeDados();
}
