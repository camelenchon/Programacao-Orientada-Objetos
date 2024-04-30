import java.util.Scanner;

public class App {

    private static final Scanner SCANNER = new Scanner(System.in);
    private static final int QUANTIDADE_VETOR = 10;
    private static int numeros[] = new int[QUANTIDADE_VETOR];

    public static void main(String[] args) {

        PreencherVetor();
        int numero = Integer.parseInt(SCANNER.nextLine());
        boolean retorno = VerificarNumero(numero);

        if (retorno == true){
            System.out.println("ACHEI");
        }else{
            System.out.println("NAO ACHEI");
        }

    }
    public static void PreencherVetor(){
        for (int i = 0; i < numeros.length; i++) {
            numeros[i] = Integer.parseInt(SCANNER.nextLine());
        }
    }
    public static boolean VerificarNumero(int numero) {
        for (int i = 0; i < numeros.length; i++) {
            if (numero == numeros[i]) {
                return true;
            }             
        }
        return false;
    }
}
