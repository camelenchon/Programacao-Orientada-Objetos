import java.util.Scanner;

public class App {
    private static final Scanner SCANNER = new Scanner(System.in);
    private static final int QUANTIDADE_MATRIZ = 4;
    private static boolean[][] matriz = new boolean[QUANTIDADE_MATRIZ][QUANTIDADE_MATRIZ];

    public static void main(String[] args) throws Exception {
        percorrerMatriz(matriz);
        System.out.println("Qual a linha que ele esta");
        int linha = Integer.parseInt(SCANNER.nextLine());
        System.out.println("Qual a coluna que ele esta");
        int coluna = Integer.parseInt(SCANNER.nextLine());
        preencherMatriz(matriz, linha, coluna);
        imprimirMatriz(matriz);
    }

    public static void percorrerMatriz(boolean[][] matriz) {
        for (int i = 0; i < QUANTIDADE_MATRIZ; i++) {
            for (int j = 0; j < QUANTIDADE_MATRIZ; j++) {
                matriz[i][j] = false;
            }
        }
    }

    public static void preencherMatriz(boolean[][] matriz, int linha, int coluna) {
        for (int i = 0; i < QUANTIDADE_MATRIZ; i++) {
            for (int j = 0; j < QUANTIDADE_MATRIZ; j++) {
                if (linha == i && coluna == j) {
                    matriz[i][j] = true;
                }
            }
        }
    }

    public static void imprimirMatriz(boolean[][] matriz) {
        for (int i = 0; i < QUANTIDADE_MATRIZ; i++) {
            for (int j = 0; j < QUANTIDADE_MATRIZ; j++) {
                if (matriz[i][j] == true) {
                    System.out.print("| O |");
                } else {
                    System.err.print("| X |");
                }
            }
            System.out.println();
        }
    }
}
