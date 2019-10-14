//Analise a classe ContaCorrente abaixo e acrescente o tratamento de
//        operações inválidas (saldo inicial, depósito ou saques nulos ou
//        negativos e saque maior que o saldo) lançando exceções. Crie
//        exceções verificadas para tratar problemas com o saldo inicial e
//        depósito ou retiradas menores ou iguais a zero. Crie uma exceção não
//        verificada para os problemas relativos a retiradas maiores que o saldo.

public class ContaCorrente {

    private double saldo;
    public static int contaContas = 0;
    public static int contaTentativaContas = 0;


    public ContaCorrente(double saldoInicial) {
        if (saldoInicial<0){
            contaTentativaContas++;
            throw new IllegalArgumentException("Saldo inicial deve ser maior ou igual a zero!");
        }
        else {saldo = saldoInicial; contaContas++; contaTentativaContas++;}
    }

    public void deposito(double valor) {
        if (valor<=0){
            throw new IllegalArgumentException("Depósito deve ser maior que zero!");
        }
        else saldo += valor;
    }

    public void retirada(double valor) {
        if (valor<=0){
            throw new IllegalArgumentException("Retirada deve ser maior que zero!");
        }
        else if (saldo-valor<0){
            throw new IllegalArgumentException("Retirada deve ser menor ou igual ao saldo atual!");
        }
        else saldo -= valor;
    }

    public double getSaldo() {
        return (saldo);
    }

}