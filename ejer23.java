import java.util.Scanner;

public class ejer23 {

    public static void main(String[] args) {

        String matriz[][] = new String[5][5];
        Scanner scanner = new Scanner(System.in);
        int fila_user = 2; int columna_user = 3;

        for (int i=0; i<5; i++) {
            for (int j=0; j<5; j++) {
                matriz[i][j] = "*";
            }
        }

        while (true) {

            matriz[fila_user][columna_user] = "X";

            for (int i = 0; i < 5; i++) {
                for (int j = 0; j < 5; j++) {
                    System.out.print(matriz[i][j] + " ");
                }
                System.out.println();
            }

            System.out.print("Elija La dirección: ");
            String direction_user = scanner.next();

            if (direction_user.equals("w")) {
                if (fila_user != 0) {
                        matriz[fila_user][columna_user] = "*";
                        fila_user -= 1;
                }
            }

            if (direction_user.equals("s")) {
                if (fila_user != 5) {
                    matriz[fila_user][columna_user] = "*";
                    fila_user += 1;
                }
            }

            if (direction_user.equals("a")) {
                if (columna_user != 0) {
                    matriz[fila_user][columna_user] = "*";
                    columna_user -= 1;
                }
            }

            if (direction_user.equals("d")) {
                if (columna_user != 5) {
                        matriz[fila_user][columna_user] = "*";
                        columna_user += 1;
                }
            }
        }

    }

}
