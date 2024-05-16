public class Viagem {
    String destino;
    int duracaoDeDias;
    boolean temBagagem;

    public void malas() {
        if (temBagagem) {
            System.out.println("O limite de peso eh de 23kg");
        } else
            System.out.println("Voce pode carregar uma mochila e mais uma bolsa");
    }

    public void duracaoViagem() {
        if (duracaoDeDias > 10) {
            System.out.println("Voce vai se divertir muito");
        } else {
            System.out.println("Vai ter diversao, mas nem tanto");
        }
    }

    public void imprimirDetalhesViagem1() {
        System.out.println(String.format("O destino eh %s.", destino));
        System.out.println(String.format("A viagem tem duracao de %s dias.", duracaoDeDias));
        System.out.println(String.format("A bagagem esta inclusa na passagem? %s.", temBagagem));
    }

}
