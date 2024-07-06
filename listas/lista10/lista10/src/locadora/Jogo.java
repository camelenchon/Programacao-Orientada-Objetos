package locadora;

public class Jogo implements Audiovisual {
    private String titulo;
    private String plataforma;

    public Jogo(String titulo, String plataforma) {
        this.titulo = titulo;
        this.plataforma = plataforma;
    }

    @Override
    public void exibirInfo() {
        System.out.printf("\nO jogo %s esta disponivel na plataforma do %s", getTitulo(), getPlataforma());
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getPlataforma() {
        return plataforma;
    }

    public void setPlataforma(String plataforma) {
        this.plataforma = plataforma;
    }

}
