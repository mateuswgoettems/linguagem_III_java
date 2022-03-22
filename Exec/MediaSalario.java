import java.util.ArrayList;
import java.util.Random;

public class MediaSalario {
    public static void main(String[] args){

        ArrayList<Double> salarios = new ArrayList<Double>();
        Double totalSalario = 0.0;
        Double mediaSalarial = 0.0;

        for (int x = 0; x <= 5; x++){
            salarios.add(getRandom(1, 10) * 1000);

            totalSalario += salarios.get(x);
        }

        mediaSalarial = totalSalario / salarios.size();

        System.out.printf("%.2f", mediaSalarial);

    }

    public static double getRandom(int min, int max){
        Random random = new Random();

        return min + (max - min) * random.nextDouble();
    }
}
