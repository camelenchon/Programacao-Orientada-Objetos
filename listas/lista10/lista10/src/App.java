import java.util.ArrayList;
import java.util.List;

import locadora.Audiovisual;
import locadora.Filme;
import locadora.Jogo;
import locadora.Locadora;

public class App {
    public static void main(String[] args) throws Exception {
        
        List<String>atores = new ArrayList<>();
        
        atores.add("Amanda Seyfried");
        atores.add("Gael Garcia Bernal");
        atores.add("Franco Nero");
        atores.add("Christopher Egan");

        Filme cartasPraJulieta = new Filme("Cartas para Julieta", "Gary Winick", atores);

        Jogo miranha = new Jogo("O homem aranha", "Playstation");
        
        Locadora<Audiovisual> locadora1 = new Locadora<>();
        locadora1.adicionarItem(miranha);
        locadora1.adicionarItem(cartasPraJulieta);

        locadora1.listarItens();

        Audiovisual item1 = locadora1.buscarItem("O homem aranha");
        if (item1 != null){
            System.out.println("\n" + item1.getTitulo()); 
        }

    }
}
