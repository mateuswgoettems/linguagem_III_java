package JogoDaForca;

import java.util.*;

public class Ranking {
        private ArrayList<Jogador> rank;
        
        public Ranking(){
            rank = new ArrayList<Jogador>();
        }
        
        private void atualiza(){
            this.rank.sort(new Comparator<Jogador>(){
                @Override
                public int compare(Jogador j1, Jogador j2){ return j2.getVitorias() - j1.getVitorias();}
            });
        }
        
        public void insereJogador(Jogador jogador){
            rank.add(jogador);   
        }
        
        public void mostraRank(){
            atualiza();
            Iterator it = rank.iterator();
            int pos = 1;
            while(it.hasNext()){
                Jogador jogador = (Jogador) it.next();
                System.out.println(pos + "º - " + jogador);
                pos++;
	       }
        }
        
        public Jogador getJogador(int i){
            return (Jogador) rank.get(i);
        }
}