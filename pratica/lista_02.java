import java.util.Scanner;

public class lista_02 {

    // // atividade 01 - Area
    // static void triangulo(double b, double h) {
    // System.out.printf("TRIANGULO: %.3f\n", b * h / 2);
    // }

    // static void circulo(double r) {
    // System.out.printf("CIRCULO: %.3f\n", 3.14159 * Math.pow(r, 2));
    // }

    // static void trapezio(double b, double B, double h) {
    // System.out.printf("TRAPEZIO: %.3f\n", (b + B) * h / 2);
    // }

    // static void quadrado(double l) {
    // System.out.printf("QUADRADO: %.3f\n", Math.pow(l, 2));
    // }

    // static void retangulo(double b, double h) {
    // System.out.printf("RETANGULO: %.3f\n", b * h);
    // }

    // public static void main(String[] args) {
    // Scanner sc = new Scanner(System.in);

    // double a = sc.nextDouble();
    // double b = sc.nextDouble();
    // double c = sc.nextDouble();

    // triangulo(a, c);
    // circulo(c);
    // trapezio(a, b, c);
    // quadrado(b);
    // retangulo(a, b);

    // sc.close();
    // }

    // atividade 02 - O Maior
    // static double maior(double a, double b) {
    // return (a + b + Math.abs(a - b)) / 2;
    // }

    // public static void main(String[] args) {
    // Scanner sc = new Scanner(System.in);

    // double a = sc.nextDouble();
    // double b = sc.nextDouble();
    // double c = sc.nextDouble();

    // System.out.printf("%.0f eh o maior\n", maior(maior(a, b), c));

    // sc.close();
    // }

    // atividade 03 - Conversão de tempo
    static int divisao(int a, int b) {
        return a / b;
    }

    static int modulo(int a, int b) {
        return a % b;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        System.out.printf("%d:%d:%d\n", divisao(n, 3600), divisao(modulo(n, 3600), 60), modulo(modulo(n, 3600), 60));

        sc.close();
    }

}