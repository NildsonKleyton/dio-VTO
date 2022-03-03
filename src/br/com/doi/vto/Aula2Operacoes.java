package br.com.doi.vto;

public class Aula2Operacoes {
    public static void main(String[] args) {
        System.out.println("PrePos");
        PrePos();
        System.out.println("Aritmético");
        Aritmetico();
        System.out.println("Atribuição");
        Atribuicao();
        System.out.println("Precendência");
        Precedencia();
    }

    private static void PrePos() {
        int k = 10;
        System.out.println("k: "+k);
        int i = ++k; // primeiro soma uma unida ao k e o i recebe 11
        System.out.println("k: "+k);
        int j = k--; // o j recebera o k--  o j recebera 11 e depois o k ser igua a 10
        int x = k;

        System.out.println("i: " + i + "\nj: " + j + "\nx: " + k);

    }

    private static void Aritmetico() {
        int a = 10;
        int b = 20;
        int c = 30;
        int d = 40;
        int e = 50;

        System.out.println("a+b: " + (a + b));
        System.out.println("c-a: " + (c - a));
        System.out.println("d*b: " + (d * b));
        System.out.println("e/a: " + (e / a));
        System.out.println("c*b: " + (c * b));

    }

    private static void Atribuicao() {
        int i = 1500;
        short j = 15;
        long l = 500L;
        int k = 35;
        float f = 4.5f;
        double d = f;

        System.out.println("d: " + d);

        i += 5; // i = i + 5
        j -= 3; // j = j - 3
        d /= 2.7d; // d = d / 2.7d
        l *= 3; // l = l * 3
        k %= 2; // k = k % 2

        System.out.println("i: " + i);
        System.out.println("j: " + j);
        System.out.println("d: " + d);
        System.out.println("l: " + l);
        System.out.println("k: " + k);

        i = k = j;
        System.out.println("k: " + k + "\ni: " + i);
    }

    private static void Precedencia() {
        int i = 10;
        int j = 20;
        int k = 30;
        System.out.println("i: " + i + "\nj: " + j + "\nk: " + k);

        int a = i++ + --j * k;// 10 + 19 * 30 -> 10 * 570 -> 580

        System.out.println("i++ + --j * k= " + a);
        System.out.println("i: " + i + "\nj: " + j + "\nk: " + k);

        System.out.println("i: " + i); // 11

        int b = k / --i % 5 * 1; //30 / 10 % 3 * 1 -> 1

        System.out.println("k / --i % 3 * 1= " + b);
        System.out.println("i: " + i); // 10

        int c = 2;
        c *= i += 5;
//      c = 2 * i; i = i + 5
//      c = 2 * i; i = 10 + 5
//      c = 2 *  15;
//      c = 30


        System.out.println("c *= i +=5: " + c);
    }
}
