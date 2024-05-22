package loja;

public class App {
    public static void main(String[] args) throws Exception {
        Loja loja = new Loja("Maria das maquiagens", "11 96554796");

        Produto produto = new Produto("Batom", "Liquido", "Rosa");
        Produto produto2 = new Produto("Rimel", "Liquido", "Preto");
        Produto produto3 = new Produto("Base", "Bege", "Cremosa");
        Produto produto4 = new Produto("Blush", "Po", "Rosa pessego");
        Produto produto5 = new Produto ("Contorno", "Po", "Terracota");


        loja.adicionarProduto(produto);
        loja.adicionarProduto(produto2);
        loja.adicionarProduto(produto3);
        loja.adicionarProduto(produto4);
        loja.adicionarProduto(produto5);

        loja.listarProdutos();

    }
}
