package biblioteca;

import java.util.ArrayList;

public class Biblioteca {
    private String nome;
    private String endereco;
    private ArrayList<Livro> livro = new ArrayList<>();

    public Biblioteca(String nome, String endereco) {
        this.nome = nome;
        this.endereco = endereco;
    }

    public Livro emprestarLivro(Usuario usuario, Livro livro) {
        if (usuario.getIdade() < livro.getClassificacaoIndicativa()) {
            System.out.println("ve se cresce");
            return livro;

        }
        if (livro.getEstahEmprestado()) {
            System.out.println("Ja emprestamos!!");
            return livro;
        }
        System.out.println("Ta aqui" + livro.getNome());
        livro.setEstahEmprestado(true);
        {
            usuario.getLivros().add(livro);

        }
        public ArrayList<Livro>getLivros(){
            return this.livros;
        }
    }
}