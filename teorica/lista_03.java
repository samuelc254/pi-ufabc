package teorica;

public class lista_03 {

    static int f1(int a, int b, int c, int d) {
        int m1 = a, m2 = c;
        if (m1 < b)
            m1 = b;
        if (m2 < d)
            m2 = d;
        if (m1 < m2)
            return m2;
        else
            return m1;
    }

    static int mat(int x) {
        if (x % 10 >= 5) {
            return (x / 10) % 10;
        } else {
            return x % 10;
        }
    }

    static int fff(int n) {
        if (n == 0) {
            return 1;
        } else {
            return fff(n - 1) * n;
        }
    }

    static int troca(int w, int q) {
        if (w < q) {
            w = troca(q, w);
        }
        return w;
    }

    public static void main(String[] args) {

        System.out.println(troca(12,45));
    }
}
