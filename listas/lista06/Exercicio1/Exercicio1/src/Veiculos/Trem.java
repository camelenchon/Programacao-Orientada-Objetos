package Veiculos;

public class Trem implements Veiculo {
    private int numeroVagoes;
    private int assentosPreferenciais;
    private int velocidadeMinima;
    private int velocidadeMaxima;

    Trem(int numeroVagoes, int assentosPreferenciais) {
        this.numeroVagoes = numeroVagoes;
        this.assentosPreferenciais = assentosPreferenciais;
    }

    public int getNumeroVagoes() {
        return numeroVagoes;
    }

    public void setNumeroVagoes(int numeroVagoes) {
        this.numeroVagoes = numeroVagoes;
    }

    public int getAssentosPreferenciais() {
        return assentosPreferenciais;
    }

    public void setAssentosPreferenciais(int assentosPreferenciais) {
        this.assentosPreferenciais = assentosPreferenciais;
    }

    public int getVelocidadeMinima() {
        return velocidadeMinima;
    }

    public void setVelocidadeMinima(int velocidadeMinima) {
        this.velocidadeMinima = velocidadeMinima;
    }

    public int getVelocidadeMaxima() {
        return velocidadeMaxima;
    }

    public void setVelocidadeMaxima(int velocidadeMaxima) {
        this.velocidadeMaxima = velocidadeMaxima;
    }

    @Override
    public void acelerar() {
        System.out.println("PRRRRRRR PRRRRR PRRRR");
    }

    @Override
    public void frear() {
        System.out.println("PSHHHHHHHH");
    }

}
