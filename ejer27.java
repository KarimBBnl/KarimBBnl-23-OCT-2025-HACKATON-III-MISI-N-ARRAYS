import java.util.Random;
public class ejer27 {

    public static void main(String[] args) {

        int matriz[][] = new int[5][5];
        Random aleatorio = new Random();

        for (int i=0; i<5; i++) {
            for (int j=0; j<5; j++) {
                matriz[i][j] = aleatorio.nextInt(9) + 1;
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println();
        }

        int suma = 0;

        System.out.println();

        for (int i=0; i<5; i++) {
                suma += matriz[i][i];
        }
        System.out.println("Diagonal principal: "+suma);

        suma = 0;

        for (int i=0; i<5; i++) {
                suma += matriz[4 - i][i];

        }
        System.out.println("Diagonal secundaria: "+suma);





    }
}
