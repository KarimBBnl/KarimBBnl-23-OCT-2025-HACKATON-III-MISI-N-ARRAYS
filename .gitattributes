import java.util.Random;

public class Main {
    public static void main(String[] args) {
        int minas[] = new int[10];
        Random aleatorio = new Random();
        boolean repetido = false;

        for (int i = 0; i < minas.length; i++) {
            minas[i] = aleatorio.nextInt(10) + 1;
            System.out.print(minas[i]+" ");
        }

        for (int i = 0; i < minas.length; i++) {
            for (int j = 0; j < i; j++) {

                if (minas[i] == minas[j]) {
                    System.out.println("Se repite el valor "+minas[i]+" en la posición "+i);
                    repetido = true;
                    break;

                }

            }
            if (repetido == true) {
                break;

            }
        }
    }
}
