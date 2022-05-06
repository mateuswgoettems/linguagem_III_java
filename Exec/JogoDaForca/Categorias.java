package JogoDaForca;

import java.util.*;

public class Categorias
{
    private ArrayList<Categoria> categorias;
    
    public Categorias(){
        this.categorias = new ArrayList<Categoria>();
    }
    
    public void insereCategoria(Categoria categoria){
        this.categorias.add(categoria);
    }
    
    public Categoria retornaCategoria(int i)
    {
        return (Categoria) categorias.get(i);
    }
    
    public void getCategorias(){
        int pos = 0;
        Iterator it = categorias.iterator();
        while(it.hasNext()){
            Categoria categoria = (Categoria) it.next();
            System.out.println(""+pos+" - "+categoria.getNome());
            pos++;
        }
    }
}
