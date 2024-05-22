package loja;

import java.util.ArrayList;

public class Produto {
    private String nomeDoProduto;
    private String textura;
    private String cor;
    private ArrayList<Produto> produtos = new ArrayList<>();

    public Produto(String nomeDoProduto, String textura, String cor) {
        this.nomeDoProduto = nomeDoProduto;
        this.textura = textura;
        this.cor = cor;
    }

    public String getnomeDoProduto() {
        return this.nomeDoProduto;
    }

    public void setnomeDoProduto(String nomeDoProduto) {
        this.nomeDoProduto = nomeDoProduto;
    }

    public String getTextura() {
        return this.textura;
    }

    public void setTextura(String textura) {
        this.textura = textura;

    }

    public String getCor() {
        return this.cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public void detalharProduto() {
        System.out.println("O produto é um: " + nomeDoProduto);
        System.out.println("Sua cor eh: " + cor);
        System.out.println("Sua textura eh: " + textura);

    }

}
