//        Analise o código da classe Aluno, a seguir. O construtor dessa classe não prevê
//        nenhum tipo de consistência. Escreva o código para fazer as consistências
//        necessárias e lançar exceções prevendo cada tipo de erro.
//        Responda: existe alguma vantagem no uso de exceções em métodos construtores para avisar sobre
//        dados inconsistentes?
//        Resposta: sim, pois assim evitamos que sejam criados objetos incosistentes.

public class Aluno {

    private int matricula;
    private String nome;
    private int anoNascimento;

    public Aluno(int umaMatr, String umNom, int umAnoNasc) {
        if (umAnoNasc < 1900){
            throw new IllegalArgumentException("Ano inválido");
        } else anoNascimento = umAnoNasc;

        nome = umNom;
        matricula = umaMatr;

    }

    public int getMatricula() {
        return matricula;
    }

    public String getNome() {
        return nome;
    }

    public int getAnoNascimento() {
        return anoNascimento;
    }

    public String toString() {
        return (matricula + ", " + nome + ", " + anoNascimento);
    }

}