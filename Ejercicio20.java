import java.util.Scanner;
import java.util.Arrays;

//INICIO CODIGO EJERCICIO 12
public class Main {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        //DEFINIMOS VARIABLES
        int resultado;
        int respuesta;
        int [] numeros = new int[6];
        int i ;
        int suma = 0;
        Scanner sc = new Scanner(System.in);
        //INICIAMOS SUMA
            for (i = 0; i < 6; i++){
                System.out.println("Escribe puntuacion de heroe " + (i+1) + ":");
                resultado = entrada.nextInt();
                numeros [i] = resultado;
                suma = suma + resultado;
            }
            
        int num = 0;
        i = 0;

        while (i < 5) {
            if (numeros[i+1] > numeros[i]) {
                num = numeros[i];
                numeros[i] = numeros [i + 1];
                numeros [i + 1] = num;
                i = 0;
            }
            else {
                i ++;
            }
        }
        System.out.println(Arrays.toString(numeros));
        }
    }
