import java.util.Random;

public class Ej18 {
    public static void main(String[] args) {
        Random rand = new Random();
        int partida[][] = new int[2][6];
        int contador1 = 0;
        int contador2 = 0;

        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 6; j++) {
                partida[i][j] = rand.nextInt(6) +1;
            }
        }

        for (int j = 0; j <6 ; j++) {
            System.out.println("Partida numero " + (j+1));
            System.out.println("Jugador 1 ----- " + partida[0][j]);
            System.out.println("Jugador 2 ----- " + partida[1][j]);

            if (partida[0][j] > partida[1][j]) {
                System.out.println("Jugador 1 ha ganado!");
                contador1 += 1;
            }
            else if (partida[1][j] > partida[0][j])  {
                System.out.println("Jugador 2 ha ganado!");
                contador2 += 1;
            }
            else {
                System.out.println("Empate!");
            }
            System.out.println();
        }
        System.out.println("El jugador 1 gano " + contador1 + " veces");
        System.out.println("El jugador 2 gano " + contador2 + " veces");

        if (contador1 > contador2) {
            System.out.println("-----El jugador 1 es el gandor final-----");
        }else if (contador2 > contador1) {
            System.out.println("-----El jugador 2 es el ganador final-----");

        } else {
            System.out.println("Empate final");

        }
    }
}
