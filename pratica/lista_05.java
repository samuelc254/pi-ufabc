import java.util.Scanner;

public class lista_05 {

    // // Atividade 1 - Onde Estão Minhas Chaves
    // public static void main(String[] args) {
    // Scanner entrada = new Scanner(System.in);

    // int Q = entrada.nextInt();
    // int E = entrada.nextInt();

    // boolean[] escritoriosVisitados = new boolean[1001];

    // for (int i = 0; i < E; i++) {
    // int escritorio = entrada.nextInt();
    // escritoriosVisitados[escritorio] = true;
    // }

    // for (int i = 0; i < Q; i++) {
    // int escritorio = entrada.nextInt();

    // if (escritoriosVisitados[escritorio]) {
    // System.out.println("0");
    // } else {
    // escritoriosVisitados[escritorio] = true;
    // System.out.println("1");
    // }
    // }

    // entrada.close();
    // }

    // // Atividade 2 - Loteria
    // public static void main(String[] args) {
    // Scanner entrada = new Scanner(System.in);

    // int[] numerosApostados = new int[6];
    // for (int i = 0; i < 6; i++) {
    // numerosApostados[i] = entrada.nextInt();
    // }

    // int[] numerosSorteados = new int[6];
    // for (int i = 0; i < 6; i++) {
    // numerosSorteados[i] = entrada.nextInt();
    // }

    // int acertos = 0;
    // for (int i = 0; i < 6; i++) {
    // for (int j = 0; j < 6; j++) {
    // if (numerosApostados[i] == numerosSorteados[j]) {
    // acertos++;
    // break;
    // }
    // }
    // }

    // String premio;
    // switch (acertos) {
    // case 6:
    // premio = "sena";
    // break;
    // case 5:
    // premio = "quina";
    // break;
    // case 4:
    // premio = "quadra";
    // break;
    // case 3:
    // premio = "terno";
    // break;
    // default:
    // premio = "azar";
    // break;
    // }

    // System.out.println(premio);

    // entrada.close();
    // }

    // Atividade 3 - Exame Geral
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        while (entrada.hasNext()) {
            int numeroHabitantes = entrada.nextInt();
            int numeroConsultas = entrada.nextInt();

            int[] notas = new int[numeroHabitantes];
            for (int i = 0; i < numeroHabitantes; i++) {
                notas[i] = entrada.nextInt();
            }

            for (int i = 0; i < numeroHabitantes - 1; i++) {
                int indiceDoMaior = i;

                for (int j = i + 1; j < numeroHabitantes; j++) {
                    if (notas[j] > notas[indiceDoMaior]) {
                        indiceDoMaior = j;
                    }
                }

                if (indiceDoMaior != i) {
                    int temp = notas[i];
                    notas[i] = notas[indiceDoMaior];
                    notas[indiceDoMaior] = temp;
                }
            }

            for (int i = 0; i < numeroConsultas; i++) {
                int posicao = entrada.nextInt();
                System.out.println(notas[posicao - 1]);
            }
        }
        entrada.close();
    }
}