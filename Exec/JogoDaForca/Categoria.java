package JogoDaForca;

import java.util.*;

public class Categoria
{
    private String nome;
    private ArrayList<Palavra> pals;
    
    public Categoria(String nome){
        this.nome = nome;
        pals = new ArrayList<Palavra>();
    }
    
    public void inserepalavra(Palavra palavra){
        pals.add(palavra);
    }
    
    public Palavra getPalavra(int dificuldade){
        Random r = new Random();
        Palavra p = pals.get(r.nextInt(pals.size()));
        while(p.getDificuldade() != dificuldade){
            p = pals.get(r.nextInt(pals.size()));
        }
        return p;
    }
    
    public String getNome(){
        return nome;
    }
}
