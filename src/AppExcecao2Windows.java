import java.util.Scanner;

public class AppExcecao2Windows {

            public static void main (String[] args) {
                Scanner teclado = new Scanner (System.in);
                System.out.println("Insira um número");
                String s1 = teclado.nextLine();
                System.out.println("Insira um número");
                String s2 = teclado.nextLine();
                String [] vetorS = new String[2];
                vetorS[0] = s1;
                vetorS[1] = s2;

                divisaoSegura(vetorS);

        }

        private static void divisaoSegura(String array[]) {
            try {
                System.out.println(divideArray(array));
            }
            catch(Exception e) {
                System.out.println("Houve um erro!");
            }
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
            return i1 / i2;
        }


}
