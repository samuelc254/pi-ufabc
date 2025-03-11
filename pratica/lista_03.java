import java.util.Scanner;

public class lista_03 {

    // atividade 01 - Média 03
    // public static void main(String[] args) {
    // Scanner sc = new Scanner(System.in);

    // double n1 = sc.nextDouble();
    // double n2 = sc.nextDouble();
    // double n3 = sc.nextDouble();
    // double n4 = sc.nextDouble();

    // double media = ((n1 * 2) + (n2 * 3) + (n3 * 4) + (n4 * 1)) / 10;
    // System.out.println("Media: " + (((int)(media * 10)) / 10.0));

    // if (media > 6.9) {
    // System.out.println("Aluno aprovado.");
    // } else if (media < 5.0) {
    // System.out.println("Aluno reprovado.");
    // } else {
    // System.out.println("Aluno em exame.");
    // double exame = sc.nextDouble();
    // System.out.printf("Nota do exame: %.1f\n", exame);
    // media = (media + exame) / 2;
    // if (media > 5.0) {
    // System.out.println("Aluno aprovado.");
    // } else {
    // System.out.println("Aluno reprovado.");
    // }
    // System.out.printf("Media final: %.1f\n", media);
    // }

    // sc.close();
    // }

    // atividade 02 - Aumento de Salário
    // public static void main(String[] args) {
    // Scanner sc = new Scanner(System.in);

    // double salario = sc.nextDouble();
    // int percentual = 0;

    // if (salario <= 400.0) {
    // percentual = 15;
    // } else if (salario <= 800.0) {
    // percentual = 12;
    // } else if (salario <= 1200.0) {
    // percentual = 10;
    // } else if (salario <= 2000.0) {
    // percentual = 7;
    // } else {
    // percentual = 4;
    // }
    // double reajuste = salario * (percentual / 100.0);

    // System.out.printf("Novo salario: %.2f\n", salario + reajuste);
    // System.out.printf("Reajuste ganho: %.2f\n", reajuste);
    // System.out.println("Em percentual: " + percentual + " %");

    // sc.close();
    // }

    // atividade 03 - Andando no tempo
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int c1 = sc.nextInt();
        int c2 = sc.nextInt();
        int c3 = sc.nextInt();

        if ((c1 == c2) ||
                (c1 == c3) ||
                (c2 == c3) ||
                (c1 == c2 + c3) ||
                (c2 == c1 + c3) ||
                (c3 == c1 + c2)) {
            System.out.println("S");
        } else {
            System.out.println("N");
        }

        sc.close();
    }
}