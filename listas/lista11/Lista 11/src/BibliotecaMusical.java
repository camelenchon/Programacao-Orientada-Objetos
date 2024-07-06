import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import exeptions.MusicaNaoEncontradaException;

public class BibliotecaMusical {
    Map<String, Musica> acervo = new HashMap<>();

    public void adicionarMusica(Musica musica) {
        acervo.put(musica.getTitulo(), musica);
    }

    public Musica buscarMusica(String titulo) throws MusicaNaoEncontradaException {
        Musica musica = this.acervo.get(titulo);
        if (musica == null) {
            throw new MusicaNaoEncontradaException("A musica nao foi encontrada");
        }
        return musica;

    }

    public void listarMusicas() {
        System.out.println("A lista de musicas disponiveis na biblioteca musical: \n");
        for (Entry<String, Musica> musica : acervo.entrySet()) {
            System.out.println(musica.getValue().getTitulo());
        }

    }

}
