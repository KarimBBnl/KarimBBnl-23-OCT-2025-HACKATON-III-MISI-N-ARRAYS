import java.util.Scanner;
import java.util.Arrays;

public class ejer15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int vidas = 5;

        // Palabra para adivinar
        String[] palabra = {"j", "a", "v", "a"};
        String palabraCompleta = "java";

        // Progreso
        String[] progreso = {"_", "_", "_", "_"};

        while (vidas>0){
            System.out.println("vidas actuales = " + vidas);
            System.out.println("Introduce una letra para intentar adivinar la palabra: " + Arrays.toString(progreso));

            String letra = sc.nextLine();

            // Comprobar si la letra está en la palabra
            boolean acierto = false;
            for (int i = 0; i < palabra.length; i++) {
                if (palabra[i].equals(letra)) {
                    progreso[i] = letra; // Reemplazar el guión bajo por la letra acertada
                    acierto = true;
                }
            }

            // Mostrar el progreso actualizado
            if (acierto) {
                System.out.println("Has acertado!!!");
            } else {
                System.out.println("Letra incorrecta.");
                vidas--;
            }

            System.out.println("Progreso actual: " + Arrays.toString(progreso));


            if (Arrays.toString(palabra).equals(Arrays.toString(progreso))){
                System.out.println(palabraCompleta);
                System.out.println(Arrays.toString(progreso));
                System.out.println("Enhorabuena, has adivinado la palabra, has ganado!!!");
                return;
            }


        }
        System.out.println("Oh no, te has quedado sin vida, has perdido");
    }
}