//          O que aparecerá na tela caso o método getAlgo()
//          levantar uma IllegalArgumentException?
//          Resposta: Ignora o primeiro catch e executa a a partir do segundo catch

public class Exercicio1 {

    public static void main(String args[]){
        try{
            int i = getAlgo(4,0);
        } catch (IndexOutOfBoundsException e1) {
            System.out.println("Exceção 1");
        } catch (Exception e2){
            System.out.println("Exceção 2");
        } finally {
            System.out.println("Mais nada");
        }
        System.out.println("Adeus");
    }

    //divide 2 inteiros. Throws IllegalArgumentException se i2 = 0
    private static int getAlgo(int i1, int i2) {
        //if (i2==0){
            // throw new ArithmeticException("Dividir por zero não pode!");
        //    throw new IllegalArgumentException("Dividir por zero não pode!");
        //}
        return i1 / i2;
    }

}
