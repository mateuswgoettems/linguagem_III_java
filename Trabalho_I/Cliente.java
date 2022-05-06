import java.util.Date;

public class Cliente extends Pessoa {
    public int codigo;

    Cliente(Date nascimento, String nome, int codigo) {
        super(nome, nascimento);
        this.codigo = codigo;
    }

    public void imprimeDados() {
    }
}
