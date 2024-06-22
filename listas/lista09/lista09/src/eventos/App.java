package eventos;

import java.util.ArrayList;

public class App {
    public static void main(String[] args) throws Exception {
        ArrayList<String> artistas = new ArrayList<>();
        artistas.add("Chitaozinho e Xororo");
        artistas.add("Leonardo");
        artistas.add("Zeze di Camargo & Luciano");
        Show show = new Show("Amigos", "Allianz", "10 de junho", artistas);
        show.comecarEvento();
        show.comecarEvento(true);
        show.exibirInformacoes();
        System.out.println();

        
        StandUp standUp = new StandUp("Quatro Amigos", "Shopping Frei Caneca", "12 de julho",
                "Thiago Ventura, Afonso Padilha, Marcio Donato e Dih Lopes");
        standUp.comecarEvento();
        standUp.comecarEvento("piada");
        standUp.exibirInformacoes();
        standUp.exibirInformacoes("Thiago Ventura, Afonso Padilha, Marcio Donato e Dih Lopes");

    }

}
