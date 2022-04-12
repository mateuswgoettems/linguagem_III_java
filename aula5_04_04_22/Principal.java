import java.util.Scanner;


public class Principal {
    public static void main(String args[]){
        double vol1, vol2;
        double alt1, alt2;
        double raio1, raio2;

        Cilindro c1, c2;

        Scanner entrada = new Scanner(System.in);
        alt1 = entrada.nextDouble();
        raio1 = entrada.nextDouble();
        c1 = new Cilindro(raio1, alt1);
        vol1 = c1.calculaVolume();

        alt2 = entrada.nextDouble();
        raio2 = entrada.nextDouble();
        c2 = new Cilindro(raio2, alt2);
        vol2 = c2.calculaVolume();

        entrada.close();

        if (vol1 > vol2){
            System.out.println("Cilindo 1 maior");
        }else if ( vol2 > vol1){
            System.out.println("Cilindo 2 maior");
        }else{
            System.out.println("Cilindo 2 igual cilindo 1");
        }
    }
}
