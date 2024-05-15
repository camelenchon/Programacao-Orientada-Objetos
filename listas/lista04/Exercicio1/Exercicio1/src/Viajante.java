public class Viajante {
    String nome;
    int idade;
    boolean primeiraViagem;

    public void medoAviao() {
        if (primeiraViagem) {
            System.out.println("Bem vindo a bordo");
        } else {
            System.out.println("Bem vindo novamente");
        }

    }

    public void maiorDeIdade() {
        if (idade < 18) {
            System.out.println("Você precisa estar acompanhado de um adulto responsavel");
        }
    }

}
