import java.util.Scanner;

import Loja.Produto;
import exceptions.NomeInvalidoException;
import exceptions.PrecoInvalidoException;

public class App {
    private static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) throws Exception {

        try {
            Produto produto1 = new Produto(scan.nextLine(), Integer.parseInt(scan.nextLine()));
            System.out.println("Produto lancado com sucesso!");

        } catch (NomeInvalidoException | PrecoInvalidoException e) {
            System.out.println(e.getMessage());

        }

        Produto produto2 = new Produto("Rosa", -10);

    }
}
