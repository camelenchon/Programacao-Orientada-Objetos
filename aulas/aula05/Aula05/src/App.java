import biblioteca.Biblioteca;
import biblioteca.Livro;
import biblioteca.Usuario;

import java.util.ArrayList;

public class App {
    public static void main(String[] args) throws Exception {
       Biblioteca biblioteca = new Biblioteca("Cora Coralina", "Rua dos bobos n 0");
       Usuario usuario = new Usuario("Joao Bobo", 13);
       Livro livro  = new Livro ("Romeu e Julieta", 18);
    
        usuario.verLivros();
    
       biblioteca.emprestarLivro(usuario, livro);
       biblioteca.emprestarLivro(usuario, livro.getLivros());

       usuario.verLivros();

    }
}
