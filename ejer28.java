import java.util.Random;
public class ejer28 {

    public static void main(String[] args) {

        int matriz[][] = new int[6][6];
        Random aleatorio = new Random();

        for (int i=0; i<6; i++) {
            for (int j=0; j<6; j++) {
                matriz[i][j] = aleatorio.nextInt(9) + 1;
            }
        }

        for (int i=0; i<6; i++) {
            for (int j=0; j<6; j++) {
                    System.out.print(matriz[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println();

        for (int i=0; i<6; i++) {
            for (int j=0; j<6; j++) {
                if (j >= i) {
                    System.out.print(matriz[i][j] + " ");
                }
                else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }

    }
}