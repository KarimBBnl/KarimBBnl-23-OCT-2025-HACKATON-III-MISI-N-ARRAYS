import java.util.Scanner;
public class Ej13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int contador = 0;
        System.out.println("Escribe una palabra ");
        String palabra = sc.nextLine();

        for (char c : palabra.toLowerCase().toCharArray()) {
            if (c =='a' || c=='e' || c=='i' || c=='o' || c=='u'){
                contador++;
            }
        }
System.out.println("La palabra escrita contiene "+contador  +" vocales.");
    }
}
