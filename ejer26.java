import java.util.Random;
public class ejer26 {

    public static void main(String[] args) {

        int matriz[][] = new int[4][4];
        Random aleatorio = new Random();

        for (int i=0; i<4; i++) {
            for (int j=0; j<4; j++) {
                matriz[i][j] = aleatorio.nextInt(9) + 1;
            }
        }

        int suma = 0;
        for (int i=0; i<4; i++) {
            for (int j=0; j<4; j++) {
                System.out.print(matriz[i][j] + " ");
                suma += matriz[i][j];
            }
            System.out.println("= "+ suma);
            suma = 0;
        }

        System.out.print("= = = =");
        System.out.println();

        for (int i=0; i<4; i++) {
            for (int j=0; j<4; j++) {
                suma += matriz[j][i];
            }

            System.out.print(suma + " ");
            suma = 0;
        }

    }
}
