import java.util.ArrayList;

public class CadastroPessoas {
    int quantidadeAtual = 0;
    ArrayList<Pessoa> pessoas;

    CadastroPessoas() {
        this.pessoas = new ArrayList<Pessoa>();
    }

    public void cadastraPessoa(Pessoa pessoa) {
        this.pessoas.add(pessoa);
        this.quantidadeAtual = pessoas.size();
    }

    public void imprimeCadastro() {

        for (int i = 0; i < this.pessoas.size(); i++) {
            this.pessoas.get(i);
        }
    }
}
