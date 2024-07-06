import exeptions.MusicaNaoEncontradaException;

public class App {
    public static void main(String[] args) throws MusicaNaoEncontradaException {
        Musica musica1 = new Musica("Evidencias", "Chitaozinho e Xororo", "Album2");
        Musica musica2 = new Musica("Vamo Pula", "Sandy e Jr", "Album3");

        BibliotecaMusical acervo1 = new BibliotecaMusical();
        acervo1.adicionarMusica(musica1);
        acervo1.adicionarMusica(musica2);
        acervo1.listarMusicas();
        try {
            Musica musicaBuscada = acervo1.buscarMusica("123145");
            System.out.println(musicaBuscada.getTitulo());
        } catch (MusicaNaoEncontradaException e) {
            System.err.println(e.getMessage());
        }

    }
}
