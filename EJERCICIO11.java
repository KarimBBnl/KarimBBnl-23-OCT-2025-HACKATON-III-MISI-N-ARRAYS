public class Main {
    public static void main(String[] args) {
        //Declaro variables
        int fibonacci[] = new int[15];
        fibonacci[0] = 0;
        fibonacci[1] = 1;
        System.out.println(fibonacci[0]);
        System.out.println(fibonacci[1]);

        //Hago el bucle
        for(int i = 2; i < 15; i++) {
            fibonacci[i] = fibonacci[i - 1]+ fibonacci[i - 2];
            System.out.println(fibonacci[i]);
        }


    }
}
