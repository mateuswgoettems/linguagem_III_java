package JogoDaForca;

public class Jogador
{
    private String nome;
    private int vitorias;
    
    public Jogador(String nome){
        this.nome = nome;
        vitorias = 0;
    }
    
    public String getNome(){
        return nome;
    }
    
    public int getVitorias(){
        return vitorias;
    }
    
    public void increaseVitoria(){
        vitorias++;
    }
    
    @Override
    public String toString(){
        return ""+"Nome: "+nome+" Vitorias: "+vitorias;
    }
}
