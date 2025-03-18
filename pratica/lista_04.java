import java.util.Scanner;

public class lista_04 {

    // Exercício 01 - Viagem à Marte na Velocidade de Primo
    // public static void main(String[] args) {
    // Scanner sc = new Scanner(System.in);

    // int peso = sc.nextInt();
    // int velocidade = somaPrimos(peso);
    // int distancia = 60000000;
    // int tempoHoras = distancia / velocidade;
    // int tempoDias = tempoHoras / 24;

    // System.out.printf(velocidade + " km/h\n");
    // System.out.printf(tempoHoras + " h / " + tempoDias + " d\n");

    // sc.close();
    // }

    // static boolean verificaPrimo(int num) {
    // if (num <= 1)
    // return false;
    // for (int i = 2; i <= num / 2; i++) {
    // if (num % i == 0)
    // return false;
    // }
    // return true;
    // }

    // static int somaPrimos(int start) {
    // int count = 0, sum = 0, num = start;
    // while (count < 10) {
    // if (verificaPrimo(num)) {
    // sum += num;
    // count++;
    // }
    // num++;
    // }
    // return sum;
    // }

    // Exercício 02 - Bits Trocados
    // public static void main(String[] args) {
    // Scanner sc = new Scanner(System.in);
    // int teste = 1;

    // while (true) {
    // int V = sc.nextInt();
    // if (V == 0)
    // break;

    // int notas50 = V / 50;
    // V %= 50;
    // int notas10 = V / 10;
    // V %= 10;
    // int notas5 = V / 5;
    // V %= 5;
    // int notas1 = V;

    // System.out.printf("Teste %d\n", teste);
    // System.out.printf("%d %d %d %d\n", notas50, notas10, notas5, notas1);
    // System.out.println();

    // teste++;
    // }

    // sc.close();
    // }

    // Exercício 03 - Volume da TV
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int volumeInicial = sc.nextInt();
        int numTrocas = sc.nextInt();
        int volumeAtual = volumeInicial;

        for (int i = 0; i < numTrocas; i++) {
            int modificacao = sc.nextInt();
            volumeAtual += modificacao;

            if (volumeAtual > 100) {
                volumeAtual = 100;
            } else if (volumeAtual < 0) {
                volumeAtual = 0;
            }
        }

        System.out.println(volumeAtual);
        sc.close();
    }
}
