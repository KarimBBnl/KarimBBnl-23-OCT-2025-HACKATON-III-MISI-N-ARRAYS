import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        //////////////////////////////////////
        Scanner sc = new Scanner(System.in);
        //////////////////////////////////////

        // INICIALIZAMOS PIDIENDO UNA PALABRA
        System.out.print("Escribe una palabra en MAYÚSCULAS: ");
        String palabra = sc.nextLine(); //SE GUARDA


        for (int i = 0; i < palabra.length(); i++) {
            char letra = palabra.charAt(i);

            // APLICAMOS CODIGO ASCII
            if (letra >= 65 | letra <= 90) {
                int posicion = (int) letra - 1;
                System.out.println(letra + " = " + posicion);
            } else {
                System.out.println(letra + " no es una letra mayúscula válida (A-Z)");
            }
        }

        sc.close();
    }
}
