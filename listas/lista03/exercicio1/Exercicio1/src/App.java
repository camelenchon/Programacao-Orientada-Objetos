import java.util.Scanner;

public class App {
    private static final Scanner SCAN = new Scanner(System.in);
    public static final int ANO_ATUAL = 2024;

    public static void main(String[] args) throws Exception {

        int idade = verificarIdade();
        System.out.println("Até o final de 2024 você tera " + idade + " anos");

    }

    public static int verificarIdade() {
        System.out.println("Qual o ano do seu nascimento?");
        int anoQueNasceu = Integer.parseInt(SCAN.nextLine());
        return ANO_ATUAL - anoQueNasceu;

    }
}
