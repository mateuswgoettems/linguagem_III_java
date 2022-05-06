package JogoDaForca;

import java.util.*;

public class Main {

    public static void jogo(Categoria categoria, Jogador jogador, int dificuldade) {
        Palavra palavra = categoria.getPalavra(dificuldade);
        Scanner scanner = new Scanner(System.in);
        int tamanho = palavra.getTamanho();
        int erros = tamanho / 2;
        int certo = 0;
        boolean acerto;
        String pal = palavra.getPalavra();
        char letras[] = pal.toCharArray();
        char acertos[] = new char[tamanho];
        char tentativa;
        int i;
        for (i = 0; i < tamanho; i++) {
            acertos[i] = '_';
        }

        while ((erros > 0) && (certo != tamanho)) {
            for (i = 0; i < tamanho; i++) {
                System.out.print(acertos[i]);
            }
            System.out.println("\nInforme sua tentativa:");
            tentativa = scanner.nextLine().charAt(0);
            acerto = false;
            for (int cont = 0; cont < tamanho; cont++) {
                if (tentativa == letras[i]) {
                    acertos[i] = letras[i];
                    acerto = true;
                    certo++;
                }
            }
            if (acerto = false) {
                erros--;
            }
        }
    }

    public static void main(String args[]) {
        int op, pos;
        Categorias categorias = new Categorias();
        Categoria categoria;
        Palavra palavra;
        Jogador jogador;
        String nome = new String();
        String dica = new String();
        Ranking ranking = new Ranking();
        Scanner scan = new Scanner(System.in);
        op = 1;
        while (op != 0) {
            Display.printMenu();
            op = scan.nextInt();
            switch (op) {
                case 1:
                    System.out.println("Selecione entre as categorias");
                    categorias.getCategorias();
                    pos = scan.nextInt();
                    categoria = categorias.retornaCategoria(pos);
                    System.out.println("Informe o Jogador:");
                    ranking.mostraRank();
                    pos = scan.nextInt();
                    jogador = ranking.getJogador(pos);
                    System.out.println("Informe a Dificuldade:");
                    pos = scan.nextInt();
                    jogo(categoria, jogador, pos);
                    break;
                case 2:
                    System.out.println("Informe o Nome da Categoria:");
                    nome = scan.next();
                    categoria = new Categoria(nome);
                    categorias.insereCategoria(categoria);
                    break;
                case 3:
                    System.out.println("Informe a Palavra");
                    nome = scan.next();
                    System.out.println("Informe a Dica");
                    dica = scan.next();
                    palavra = new Palavra(nome, dica);
                    System.out.println("Selecione entre as categorias");
                    categorias.getCategorias();
                    pos = scan.nextInt();
                    categoria = categorias.retornaCategoria(pos);
                    categoria.inserepalavra(palavra);
                    break;
                case 4:
                    System.out.println("Informe o nome do Jogador");
                    nome = scan.next();
                    jogador = new Jogador(nome);
                    ranking.insereJogador(jogador);
                    break;
                default:
                    System.out.println("Funcao nao existente");
                    break;
            }
        }
        scan.close();
    }
}