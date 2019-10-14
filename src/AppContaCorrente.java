public class AppContaCorrente {

    public static void main (String args[]){

        try {
            ContaCorrente conta1 = new ContaCorrente(-10); //Gera o erro de saldo inicial menor que zero
        } catch(IllegalArgumentException e){
            System.out.println("O saldo informado deve ser maior que zero");
        }

        ContaCorrente conta2 = new ContaCorrente(10);

        try {
            conta2.deposito(0); // gera erro de deposito igual a zero
        } catch (IllegalArgumentException e){
            System.out.println("O depósito tem que ser maior que zero!!");
        }

        try {
            conta2.retirada(0); //gera erro de retirada de zero
        } catch(IllegalArgumentException e){
            System.out.println("Retirada não pode ser zero ou negativa!!!");
        }

        try {
            conta2.retirada(30); //gera erro de retirada maior que o saldo
        } catch(IllegalArgumentException e){
            System.out.println("Retirada deve ser menor que o saldo!!");
        }




    }
}
