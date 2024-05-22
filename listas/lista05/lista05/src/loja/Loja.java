package loja;

import java.util.ArrayList;

public class Loja {
    private String nome;
    private String telefone;
    private boolean temDelivery;
    private ArrayList<Produto> produtos = new ArrayList<>();

    public Loja(String nome, String telefone) {
        this.nome = nome;
        this.telefone = telefone;
    }

    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTelefone() {
        return this.telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public boolean getTemDelivery() {
        return this.temDelivery;
    }

    public void setTemDelivery(boolean temDelivery) {
        this.temDelivery = temDelivery;
    }

    public void adicionarProduto(Produto produto) {
        produtos.add(produto);
    }

    public void listarProdutos() {
        for (Produto produto : produtos) {
            System.out.println("O produto eh um: " + produto.getnomeDoProduto());
            System.out.println("Sua cor eh: " + produto.getCor());
            System.out.println("Sua textura eh: " + produto.getTextura());
            System.out.println();

        }
    }
}
