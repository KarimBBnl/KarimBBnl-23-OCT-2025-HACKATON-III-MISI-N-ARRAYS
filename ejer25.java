public class ejer25 {

    public static void main(String[] args) {

        String matriz[][] = new String[5][5];
        int fila_user = 2; int columna_user = 3;

        for (int i=0; i<5; i++) {
            for (int j=0; j<5; j++) {
                matriz[i][j] = "*";
            }
        }

        matriz[fila_user][columna_user] = "X";

        for (int i=fila_user - 1; i<fila_user + 2; i++) {
            for (int j=columna_user - 1; j<columna_user + 2; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println();
        }

    }
}
