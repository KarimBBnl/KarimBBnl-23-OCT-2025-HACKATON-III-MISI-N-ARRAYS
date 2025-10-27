import java.util.Random;
public class ejer19 {

    public static void main(String[] args) {

        int array[] = new int[16];
        Random aleatorio = new Random();
        int racha_max = 1; int racha = 1;

        for (int i=0; i<15; i++) {
            array[i] = aleatorio.nextInt(5) + 1;
        }

        for (int i=0; i<15; i++) {
            if(array[i] == array[i + 1]) {
                racha++;
            }
            else {
                racha = 1;
            }
            if(racha > racha_max) {
                racha_max = racha;
            }
        }
        System.out.println("    La racha maxima es: " + racha_max);
        for (int i=0; i<15; i++) {
            System.out.print(array[i] + " ");
        }

    }
}
