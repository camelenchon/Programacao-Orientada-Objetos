package Animais;

public class Gato implements Animal {
    private String cor;
    private String tamanho;
    private String comer;
    private String som;

    public Gato(String cor, String tamanho) {
        this.cor = cor;
        this.tamanho = tamanho;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
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
        System.out.println("O gato esta comendo");
    }

    @Override
    public void emitirSom() {
        System.out.println("Miaaaau");

    }

}
