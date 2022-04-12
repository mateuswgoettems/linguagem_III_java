import java.util.Scanner;
import java.util.Random;

public class Main {
    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);
        Random r = new Random();

        System.out.println("Bem vindo ao jogo da Forca!");

        String array[] = { "micro-ondas", "fogão", "gas", "copo", "mesa", "cafeteira" };
        int numAleatorio = r.nextInt(array.length);

        int quantidadeLetras = array[numAleatorio].length();
        System.out.println("A sua palavra tem " + quantidadeLetras + " letras.");

        System.out.println("Digite uma dica:");
        String dica = input.nextLine();

        Forca forca = new Forca(array[numAleatorio], dica);

        forca.iniciarJogo();

        boolean status = false;

        for (int i = 0; i < 6; i++) {

            System.out.println("Você tem " + (6 - forca.getErros()) + " chances para acertar a palavra.");

            forca.chutarLetra();
            status = forca.getStatusTermino();

            if (status) {
                break;
            }
        }

        input.close();
    }
}
