package eventos;

import java.util.ArrayList;

public class Show extends Evento {

    private ArrayList<String> artistas;

    public Show(String nome, String local, String data, ArrayList<String> artistas) {
        super(nome, local, data);
        this.artistas = artistas;
    }

    @Override
    public void exibirInformacoes() {
        System.out.printf("O show %s vai ser no %s no dia %s. \n", getNome(), getLocal(), getData());
        System.out.println("Os artistas sao: ");
        for (int i = 0; i < artistas.size(); i++) {
            System.out.println(artistas.get(i));
        }
    }

    @Override
    public void comecarEvento() {
        System.out.println("O show vai comecar!");
    }

    public void comecarEvento(boolean comAplausos) {
        if (comAplausos) {
            System.out.println("clap clap clap clap");
        } else {
            System.out.println("ZzzZZ");
        }
    }

}