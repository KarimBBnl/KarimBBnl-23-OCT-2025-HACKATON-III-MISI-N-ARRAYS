import java.util.Random;
public class ejer24 {

    public static void main(String[] args) {

        String matriz[][] = new String[6][6];
        Random aleatorio = new Random();

        for (int i=0; i<6; i++) {
            for (int j=0; j<6; j++) {
                matriz[i][j] = "*";
            }
        }

        for (int i=0; i<5; i++) {
            matriz[aleatorio.nextInt(6)][aleatorio.nextInt(6)] = "X";
        }

        for (int i=0; i<6; i++) {
            for (int j=0; j<6; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println();
        }

    }
}
