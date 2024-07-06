package locadora;

import java.util.List;

public class Filme implements Audiovisual {
    private String titulo;
    private String diretor;
    List<String> atores;

    public Filme(String titulo, String diretor, List<String> atores) {
        this.titulo = titulo;
        this.diretor = diretor;
        this.atores = atores;
    }

    @Override
    public void exibirInfo() {
        System.out.printf("\nO nome do filme eh: %s e o diretor eh: %s", getTitulo(), getDiretor());
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getDiretor() {
        return diretor;
    }

    public void setDiretor(String diretor) {
        this.diretor = diretor;
    }

}
