import java.util.Scanner;

public class AppExcecaoWindows {
    public static void main (String[] args) {
        Scanner teclado = new Scanner (System.in);
        System.out.println("Insira um número");
        String s1 = teclado.nextLine();
        System.out.println("Insira um número");
        String s2 = teclado.nextLine();
        String [] vetorS = new String[2];
        vetorS[0] = s1;
        vetorS[1] = s2;

        System.out.print (divideArray(vetorS));
    }

    private static int divideArray(String[] array) {
        String s1 = array[0];
        String s2 = array[1];
        return divideStrings(s1, s2);
    }

    private static int divideStrings(String s1, String s2) {
        int i1 = Integer.parseInt(s1);
        int i2 = Integer.parseInt(s2);
        return divideInts(i1, i2);
    }

    private static int divideInts(int i1, int i2) {
        if (i2==0){
            // throw new ArithmeticException("Dividir por zero não pode!");
            throw new IllegalArgumentException("Dividir por zero não pode!");
        }
        return i1 / i2;
    }
}
