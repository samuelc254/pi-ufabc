import java.util.Scanner;

public class p2 {

    // Atividade 01 - Presentes do Noel
    // public static void main(String[] args) {
    // Scanner sc = new Scanner(System.in);
    // int N = sc.nextInt();
    // int[] boasAcoes = new int[N];
    // for (int i = 0; i < N; i++) {
    // boasAcoes[i] = sc.nextInt();
    // }

    // int[] unicos = new int[N];
    // int unicosCount = 0;
    // for (int i = 0; i < N; i++) {
    // boolean jaExiste = false;
    // for (int j = 0; j < unicosCount; j++) {
    // if (boasAcoes[i] == unicos[j]) {
    // jaExiste = true;
    // break;
    // }
    // }
    // if (!jaExiste) {
    // unicos[unicosCount++] = boasAcoes[i];
    // }
    // }

    // for (int i = 0; i < unicosCount - 1; i++) {
    // for (int j = 0; j < unicosCount - i - 1; j++) {
    // if (unicos[j] > unicos[j + 1]) {
    // int temp = unicos[j];
    // unicos[j] = unicos[j + 1];
    // unicos[j + 1] = temp;
    // }
    // }
    // }

    // int[] presentesPorAcao = new int[10001];
    // int presenteAtual = 1;
    // for (int i = 0; i < unicosCount; i++) {
    // presentesPorAcao[unicos[i]] = presenteAtual++;
    // }

    // int totalPresentes = 0;
    // for (int i = 0; i < N; i++) {
    // totalPresentes += presentesPorAcao[boasAcoes[i]];
    // }

    // System.out.println(totalPresentes);
    // sc.close();
    // }

    // Atividade 02 - Mega Inversões
    // public static void main(String[] args) {
    // Scanner sc = new Scanner(System.in);
    // int n = sc.nextInt(); // Lê o tamanho da sequência
    // int[] seq = new int[n];
    // for (int i = 0; i < n; i++) {
    // seq[i] = sc.nextInt(); // Lê a sequência
    // }

    // int[] maioresEsq = new int[n]; // Quantos maiores à esquerda de cada posição
    // int[] menoresDir = new int[n]; // Quantos menores à direita de cada posição
    // int[] bit = new int[n + 2]; // BIT para contagem eficiente

    // // Conta maiores à esquerda usando BIT
    // for (int i = 0; i < n; i++) {
    // int val = seq[i];
    // // Soma total de elementos já inseridos
    // int sum = 0, idx = n;
    // while (idx > 0) {
    // sum += bit[idx];
    // idx -= idx & -idx;
    // }
    // // Soma de elementos <= val
    // idx = val;
    // int sum2 = 0;
    // while (idx > 0) {
    // sum2 += bit[idx];
    // idx -= idx & -idx;
    // }
    // // Maiores à esquerda = total inseridos - inseridos <= val
    // maioresEsq[i] = sum - sum2;
    // // Atualiza BIT com o valor atual
    // idx = val;
    // while (idx < bit.length) {
    // bit[idx] += 1;
    // idx += idx & -idx;
    // }
    // }

    // // Limpa o BIT para reutilizar
    // for (int i = 0; i < bit.length; i++)
    // bit[i] = 0;

    // // Conta menores à direita usando BIT
    // for (int i = n - 1; i >= 0; i--) {
    // int val = seq[i];
    // // Soma de elementos menores que val já inseridos
    // int sum = 0, idx = val - 1;
    // while (idx > 0) {
    // sum += bit[idx];
    // idx -= idx & -idx;
    // }
    // menoresDir[i] = sum;
    // // Atualiza BIT com o valor atual
    // idx = val;
    // while (idx < bit.length) {
    // bit[idx] += 1;
    // idx += idx & -idx;
    // }
    // }

    // // Calcula o total de triplas invertidas
    // long total = 0;
    // for (int i = 0; i < n; i++) {
    // total += (long) maioresEsq[i] * menoresDir[i];
    // }
    // System.out.println(total); // Imprime o resultado
    // sc.close();
    // }

    // // Atividade 03 - Eu Quero Cafééé
    // public static void main(String[] args) {
    // Scanner sc = new Scanner(System.in);
    // int N = sc.nextInt();
    // int L = sc.nextInt();
    // int D = sc.nextInt();

    // int totalMl = N * D;
    // int totalLitros = (totalMl + 999) / 1000;
    // int preparos = (totalLitros + L - 1) / L;
    // int resposta = preparos * L;

    // System.out.println(resposta);
    // sc.close();
    // }

    // Atividade 04 - Passeios cotidianos
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int H = sc.nextInt();
        int W = sc.nextInt();
        sc.nextLine(); 

        int casa = H;
        int trab = W;
        char[][] chuva = new char[N][2];
        for (int i = 0; i < N; i++) {
            String linha = sc.nextLine().trim();
            chuva[i][0] = linha.charAt(0);
            chuva[i][1] = linha.charAt(2);
        }

        for (int i = 0; i < N; i++) {
            String saida = "";

            // Viagem de casa para o trabalho
            if (chuva[i][0] == 'Y') {
                // Leva guarda-chuva
                if (casa > 0) {
                    casa--;
                    trab++;
                }
                saida += 'Y';
            } else if (trab == 0 && casa > 0) {
                // Leva por precaução
                casa--;
                trab++;
                saida += 'Y';
            } else {
                saida += 'N';
            }

            saida += ' ';

            // Viagem do trabalho para casa
            if (chuva[i][1] == 'Y') {
                // Leva guarda-chuva
                if (trab > 0) {
                    trab--;
                    casa++;
                }
                saida += 'Y';
            } else if (casa == 0 && trab > 0) {
                // Leva por precaução
                trab--;
                casa++;
                saida += 'Y';
            } else {
                saida += 'N';
            }

            System.out.println(saida);
        }
        sc.close();
    }

}
