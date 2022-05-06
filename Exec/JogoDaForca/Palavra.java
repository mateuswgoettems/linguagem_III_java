package JogoDaForca;

public class Palavra
{
   private String palavra;
   private String dica;   
   private int dificuldade;
   
   public Palavra(String palavra, String dica){
       int tamanho = palavra.length();
       this.palavra = palavra;
       this.dica = dica;
       if(tamanho <= 10){
           dificuldade = 1;
       }
       else if(tamanho <= 20){
           dificuldade = 2;
       }
       else if(tamanho > 20){
           dificuldade = 3;
       }
   }
   
   public int getDificuldade(){
       return dificuldade;
   }
   
   public String getPalavra(){
       return palavra;
   }
   
   public String getDica(){
       return dica;
   }
   public int getTamanho()
   {
       return palavra.length();
    }
}
