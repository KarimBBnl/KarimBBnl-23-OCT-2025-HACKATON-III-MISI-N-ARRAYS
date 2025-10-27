public class ejer21 {

    public static void main(String[] args) {

        String matriz[][] = new String[5][5];

        for (int i=0; i<5; i++) {
            for (int j=0; j<5; j++) {
                matriz[i][j] = "0";
            }
        }

        for (int i=0; i<5; i++) {
            for (int j=0; j<5; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println();
        }

    }

}
