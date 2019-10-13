import java.util.Scanner;

public class Fatorial {

    public static double fatorial(int x) {
        if (x < 0) {
            throw new IllegalArgumentException("x deve ser > 0");
        } else {
            double fact;
            for (fact = 1.0; x > 1; x--)
                fact = fact * x;
            return (fact);
        }
    }
    public static void main(String[] args) {
        int continua = 0;
        Scanner sc = new Scanner(System.in);
        do{
            System.out.print("Digite o valor para o calculo:");
            int x = sc.nextInt();
            double result = fatorial(x);
            System.out.println("Fatorial de "+x+" = "+result);
            System.out.println("Digite 0 para continuar ou outro nro para parar");
            continua = sc.nextInt();
        }while(continua == 0);
        System.out.println("Fim");
    }
}