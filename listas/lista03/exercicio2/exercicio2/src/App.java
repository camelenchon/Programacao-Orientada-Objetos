import java.util.Scanner;

public class App {
    private static final int NOTAS_CRITICOS = 3;
    private static int[] NOTAS = new int[NOTAS_CRITICOS];
    private static Scanner SCAN = new Scanner(System.in);

    public static void main(String[] args) throws Exception {
        armazenarNotas();
        imprimirMedia();
    }

    public static void armazenarNotas() {

        for (int i = 0; i < NOTAS_CRITICOS; i++) {
            NOTAS[i] = Integer.parseInt(SCAN.nextLine());
        }

    }

    public static void imprimirMedia() {
        int somatorio = 0;
        for (int i = 0; i < NOTAS_CRITICOS; i++) {
            somatorio += NOTAS[i];
        }
        System.out.println(somatorio / 3);

    }

}
