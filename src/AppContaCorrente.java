public class AppContaCorrente {

    public static void main (String args[]){

        //ContaCorrente conta1 = new ContaCorrente(-10); //Gera o erro de saldo inicial menor que zero
        ContaCorrente conta2 = new ContaCorrente(10);
        //conta2.deposito(0); // gera erro de deposito igual a zero
        //conta2.retirada(0); //gera erro de retirada de zero
        conta2.retirada(30); //gera erro de retirada maior que o saldo



    }
}
