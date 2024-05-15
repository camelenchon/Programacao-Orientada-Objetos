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

}
