import java.util.Scanner;

public class lista_06 {

    // Atividade 01 - Coluna na Matriz
    // public static void atividade1() {
    // Scanner entrada = new Scanner(System.in);

    // int coluna = entrada.nextInt();
    // char operacao = entrada.next().charAt(0);

    // double[][] matriz = new double[12][12];
    // for (int i = 0; i < 12; i++) {
    // for (int j = 0; j < 12; j++) {
    // matriz[i][j] = entrada.nextDouble();
    // }
    // }

    // double soma = 0.0;
    // for (int i = 0; i < 12; i++) {
    // soma += matriz[i][coluna];
    // }

    // if (operacao == 'S') {
    // System.out.printf("%.1f\n", soma);
    // } else if (operacao == 'M') {
    // System.out.printf("%.1f\n", soma / 12.0);
    // }

    // entrada.close();
    // }

    // Atividade 02 - Área Superior
    // public static void atividade2() {
    // Scanner entrada = new Scanner(System.in);

    // char operacao = entrada.next().charAt(0);

    // double[][] matriz = new double[12][12];
    // for (int i = 0; i < 12; i++) {
    // for (int j = 0; j < 12; j++) {
    // matriz[i][j] = entrada.nextDouble();
    // }
    // }

    // double soma = 0.0;
    // int contador = 0;
    // for (int i = 0; i < 5; i++) {
    // for (int j = i + 1; j < 11 - i; j++) {
    // soma += matriz[i][j];
    // contador++;
    // }
    // }

    // if (operacao == 'S') {
    // System.out.printf("%.1f\n", soma);
    // } else if (operacao == 'M') {
    // System.out.printf("%.1f\n", soma / contador);
    // }

    // entrada.close();
    // }

// Atividade 03 - Crepusculo em Portland
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        int N = entrada.nextInt();
        int[][] mapa = new int[N + 1][N + 1];

        for (int i = 0; i <= N; i++) {
            for (int j = 0; j <= N; j++) {
                mapa[i][j] = entrada.nextInt();
            }
        }

        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                int cameras = mapa[i][j] + mapa[i][j + 1] + mapa[i + 1][j] + mapa[i + 1][j + 1];
                if (cameras >= 2) {
                    System.out.print("S");
                } else {
                    System.out.print("U");
                }
            }
            System.out.println();
        }

        entrada.close();
    }
}