import java.util.Scanner;

public class App {
    private static Scanner SCAN = new Scanner(System.in);

    public static void main(String[] args) throws Exception {
        String nomeA = SCAN.nextLine();
        String nomeB = SCAN.nextLine();
        procurarNomes(nomeA, nomeB);
    }

    public static void procurarNomes(String nomeA, String nomeB) {

        if (nomeA.equals(nomeB)) {
            System.out.println("As palavras sao identicas.");

        } else if (nomeA.equalsIgnoreCase(nomeB)) {

            System.out.println("As palavras sao iguais ignorando maisculo e minusculo.");
        } else {
            System.out.println("As palavras sao diferentes.");

        }

    }
}
