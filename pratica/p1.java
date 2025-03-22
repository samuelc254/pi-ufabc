import java.util.Scanner;

public class p1 {

    // Atividade 1 - Desafio de Bino
    // public static void main(String[] args) {
    // Scanner scanner = new Scanner(System.in);

    // int N = scanner.nextInt();

    // int multiplosDe2 = 0;
    // int multiplosDe3 = 0;
    // int multiplosDe4 = 0;
    // int multiplosDe5 = 0;

    // for (int i = 0; i < N; i++) {
    // int numero = scanner.nextInt();

    // if (numero % 2 == 0) multiplosDe2++;
    // if (numero % 3 == 0) multiplosDe3++;
    // if (numero % 4 == 0) multiplosDe4++;
    // if (numero % 5 == 0) multiplosDe5++;
    // }

    // System.out.println(multiplosDe2 + " Multiplo(s) de 2");
    // System.out.println(multiplosDe3 + " Multiplo(s) de 3");
    // System.out.println(multiplosDe4 + " Multiplo(s) de 4");
    // System.out.println(multiplosDe5 + " Multiplo(s) de 5");

    // scanner.close();
    // }

    // Atividade 2 - Elevador
    // public static void main(String[] args) {
    // Scanner scanner = new Scanner(System.in);

    // int N = scanner.nextInt();
    // int C = scanner.nextInt();

    // int pessoasNoElevador = 0;
    // boolean capacidadeExcedida = false;

    // for (int i = 0; i < N; i++) {
    // int S = scanner.nextInt();
    // int E = scanner.nextInt();

    // pessoasNoElevador -= S;
    // pessoasNoElevador += E;

    // if (pessoasNoElevador > C) {
    // capacidadeExcedida = true;
    // }
    // }

    // if (capacidadeExcedida) {
    // System.out.println("S");
    // } else {
    // System.out.println("N");
    // }

    // scanner.close();
    // }

    // Atividade 3 - Xenlonguinho
    // public static void main(String[] args) {
    // Scanner scanner = new Scanner(System.in);

    // int C = scanner.nextInt();

    // for (int i = 0; i < C; i++) {
    // int N = scanner.nextInt();

    // int esferasComDivisoresPares = 0;

    // for (int j = 1; j <= N; j++) {
    // int divisores = 0;

    // // Conta os divisores
    // for (int k = 1; k <= j; k++) {
    // if (j % k == 0) {
    // divisores++;
    // }
    // }

    // if (divisores % 2 == 0) {
    // esferasComDivisoresPares++;
    // }
    // }

    // System.out.println(esferasComDivisoresPares);
    // }

    // scanner.close();
    // }

    // Atividade 4 - Basquete de Robôs
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int D = scanner.nextInt();

        if (D <= 800) {
            System.out.println(1);
        } else if (D <= 1400) {
            System.out.println(2);
        } else if (D <= 2000) {
            System.out.println(3);
        }

        scanner.close();
    }
}