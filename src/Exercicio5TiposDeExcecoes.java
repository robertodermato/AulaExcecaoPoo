import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.NoSuchFileException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Scanner;

public class Exercicio5TiposDeExcecoes {

    public static void main(String[] args) {


        // Exemplo de exceção verificada
        Path path2 = Paths.get("C:\\Dropbox sync\\Dropbox\\poo\\streams\\dados2.txt");
        try (Scanner sc = new Scanner(Files.newBufferedReader(path2.getFileName(), Charset.forName("utf8")))) {
            sc.useDelimiter("[;\n]"); // separadores: ; e nova linha
            String header = sc.nextLine(); // pula cabeçalho
            String nome, idade;
            while (sc.hasNext()) {
                nome = sc.next();
                idade = sc.next();
                System.out.format("%s - %s%n", nome, idade);
            }
        }
        catch (NoSuchFileException x) {
            System.err.format("Arquivo não existe!!", x);
        } catch (IOException e) { //esse catch é exigido pelo newBufferedReader
            e.printStackTrace();
        }

        //Infinity
        System.out.println("\nDigite o valor para o calculo:");
        int x = 500000000;
        double result = Fatorial.fatorial(x);
        System.out.println("Fatorial de "+x+" = "+result);

        //Fibonacci recursivo - Tentando stackOverflow
        System.out.print ("Informe qual termo da série Fibonacci você quer ver: ");
        int termo = 2;
        System.out.println ("O " + termo + " termo da série de Fibonacci é: " + fibo(termo));

        //Exceção não verificada
        int [] inteiros = new int[3];
        try{
        System.out.println(inteiros[-1]);}
        catch (ArrayIndexOutOfBoundsException e){
            System.out.println("Índice fora do valor");
        }




    }

    public static int fibo (int termo){
        if (termo==0) return 0;
        if (termo==1) return 1;
        else return fibo(termo-1)+fibo(termo-2);
    }

}
