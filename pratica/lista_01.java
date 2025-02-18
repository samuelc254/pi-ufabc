import java.util.Scanner;

public class lista_01 {

    // Atividade 01 - Média de 3 números
    // public static void main(String[] args) {
    // Scanner sc = new Scanner(System.in);

    // double n = sc.nextDouble() * 0.2;
    // n += sc.nextDouble() * 0.3;
    // n += sc.nextDouble() * 0.5;

    // System.out.printf("MEDIA = %.1f\n", n);

    // sc.close();
    // }

    // Atividade 02 - Área da esfera
    // public static void main(String[] args) {
    // Scanner sc = new Scanner(System.in);

    // double v = 4.0 / 3 * 3.14159 * Math.pow(sc.nextDouble(), 3);

    // System.out.printf("VOLUME = %.3f\n", v);

    // sc.close();
    // }

    // Atividade 03 - Gasto de combustível
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int tempo = sc.nextInt();
        int vMedia = sc.nextInt();

        System.out.printf("%.3f\n", (tempo * vMedia) / 12.0);

        sc.close();
    }
}
