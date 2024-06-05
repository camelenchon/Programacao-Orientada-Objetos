package Veiculos;

public class Carro implements Veiculo {
    private String cor;
    private String placa;
    private int quantidadeDePessoas;
    private int velocidadeMinima;
    private int velocidadeMaxima;

    Carro(String cor, String placa) {
        this.cor = cor;
        this.placa = placa;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public int getQuantidadeDePessoas() {
        return quantidadeDePessoas;
    }

    public void setQuantidadeDePessoas(int quantidadeDePessoas) {
        this.quantidadeDePessoas = quantidadeDePessoas;
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
        System.out.println("VRUMMM VRUM VRUMMM");

    }

    @Override
    public void frear() {
        System.out.println("SSHHHHHHHHHH");

    }

}
