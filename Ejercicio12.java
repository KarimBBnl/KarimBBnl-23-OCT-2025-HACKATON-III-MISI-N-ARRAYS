    import java.util.Scanner;

    //INICIO CODIGO EJERCICIO 12
    public class Main {
        public static void main(String[] args) {
            Scanner entrada = new Scanner(System.in);
            //DEFINIMOS VARIABLES
           int resultado;
           int [] numeros = new int[6];
           int i ;
           int suma = 0;
            Scanner sc = new Scanner(System.in);
          //INICIAMOS SUMA
             (i = 0; i < 6; i++){
               System.out.print("Escribe nombre de heroe: ");

               for (i = 0; i < 6; i++){
               System.out.print("Escribe puntuacion de heroe: ");
               resultado = entrada.nextInt();
               numeros [i] = resultado;
               suma = suma + resultado;
           }
            System.out.println("La suma del array es " + suma);










        }
    }
