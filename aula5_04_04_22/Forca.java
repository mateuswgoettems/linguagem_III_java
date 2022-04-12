import java.util.Scanner;

public class Forca {
    private String palavraSorteada;
    private String dica;
    private int tamPalavra;
    private int limiteErros;
    private int erros;
    private char chute;
    private char palavraAtual[];
    private boolean statusTermino;

    public Forca(String palavraSorteada, String dica){
        this.palavraSorteada = palavraSorteada;
        this.dica = dica;
        this.tamPalavra = palavraSorteada.length();
        this.limiteErros = 6;
        this.erros = 0;
        this.statusTermino = false;
    }

    public void iniciarJogo(){
        this.palavraAtual = new char[this.tamPalavra];
        for (int i = 0; i < this.tamPalavra; i++) {
            this.palavraAtual[i] = '_';
        }
        System.out.println("A palavra sorteada é: " + this.palavraSorteada);
        System.out.println("A dica é: " + this.dica);
        System.out.println("A sua palavra tem " + this.tamPalavra + " letras.");
        System.out.println("Você tem " + this.limiteErros + " chances para acertar a palavra.");
        System.out.println("A palavra atual é: " + String.valueOf(this.palavraAtual));
    }

    public void chutarLetra(){
        Scanner input = new Scanner(System.in);
        System.out.println("Digite uma letra: ");
        this.chute = input.next().charAt(0);
        if (this.palavraSorteada.indexOf(this.chute) != -1) {
            System.out.println("Letra encontrada!");
            this.atualizarPalavra(this.chute);
        } else {
            System.out.println("Letra não encontrada!");
            this.erros++;
        }
        if (this.erros == this.limiteErros) {
            System.out.println("Você perdeu!");
            this.statusTermino = true;
        }
        if (this.palavraSorteada.equals(String.valueOf(this.palavraAtual))) {
            System.out.println("Parabéns, você acertou a palavra!");
            this.statusTermino = true;
        }
        System.out.println("A palavra atual é: " + String.valueOf(this.palavraAtual));
        // input.close();
    }

    public void atualizarPalavra(char chute){
        for (int i = 0; i < this.tamPalavra; i++) {
            if (this.palavraSorteada.charAt(i) == chute) {
                this.palavraAtual[i] = chute;
            }
        }
    }

    public boolean getStatusTermino(){
        if (this.statusTermino == true) {
            System.out.println("O jogo terminou!");
            return true;
        }else{
            return false;
        }
    }

    public int getErros(){
        return this.erros;
    }

}
