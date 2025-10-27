import java.util.Random;
public class ejer30 {

    public static void main(String[] args) {

        int matriz[][] = new int[5][5];
        Random aleatorio = new Random();
        int contador = 1;

        for (int i=0; i<5; i++) {
            for (int j=0; j<5; j++) {
                matriz[i][j] = aleatorio.nextInt(2);
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();

        for (int i=0; i<5; i++) {
            for (int j=0; j<5; j++) {

                if (matriz[i][j] == 0) {
                    System.out.print("1 ");
                }
                else {
                    System.out.print("0 ");
                }
            }
            System.out.println();
        }





    }
}