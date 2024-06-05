package Animais;

public class Vaca implements Animal {
    private String nome;
    private String tamanho;
    private String comer;
    private String som;

    public Vaca(String nome, String tamanho) {
        this.nome = nome;
        this.tamanho = tamanho;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTamanho() {
        return tamanho;
    }

    public void setTamanho(String tamanho) {
        this.tamanho = tamanho;
    }

    public String getComer() {
        return comer;
    }

    public void setComer(String comer) {
        this.comer = comer;
    }

    public String getSom() {
        return som;
    }

    public void setSom(String som) {
        this.som = som;
    }

    @Override
    public void alimentar() {
        System.out.println("A vaca esta comendo");
    }

    @Override
    public void emitirSom() {
        System.out.println("MUUUU MUUUU");
    }

}
