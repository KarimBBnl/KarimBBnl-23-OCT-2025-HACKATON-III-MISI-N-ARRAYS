import java.util.Scanner;
import java.util.Arrays;

public class Ejerc14{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Palabra para adivinar
        char[] palabra = {'j', 'a', 'v', 'a'};

        // Progreso
        char[] progreso = {'_', '_', '_', '_'};

        System.out.println("Inicio, introduce una letra para intentar adivinar la palabra: " + Arrays.toString(progreso));

        char letra = sc.next().charAt(0);

        // Comprobar si la letra está en la palabra
        boolean acierto = false;
        for (int i = 0; i < palabra.length; i++) {
            if (palabra[i] == letra) {
                progreso[i] = letra; // Reemplazar el guión bajo por la letra acertada
                acierto = true;
            }
        }

        // Mostrar el progreso actualizado
        if (acierto) {
            System.out.println("¡Has acertado!");
        } else {
            System.out.println("Letra incorrecta.");
        }

        System.out.println("Progreso actual: " + Arrays.toString(progreso));

        sc.close();
    }
}