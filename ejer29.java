import java.util.Random;
public class ejer29 {

    public static void main(String[] args) {

        int matriz[][] = new int[4][4];
        Random aleatorio = new Random();
        int contador = 1;

        for (int i=0; i<4; i++) {
            for (int j=0; j<4; j++) {
                matriz[i][j] = contador;
                contador +=1;
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();



        for (int i=0; i<4; i++) {
            for (int j=3; j>-1; j--) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println();
        }

    }
}
