package br.com.doi.vto;

public class Aula4Casting {
    public static void main(String[] args) {
        // casting (Conversões) Upcast ou Downcast
        System.out.println("Exemplo de Downcast");
        byte b1;
        short s1 = 1000;
        //     ╔═→ Explicito
        b1 = (byte) s1; // Downcast - Explicito
        System.out.println("short => byte");
        System.out.println("s1: " + s1);
        System.out.println("b1: " + b1);

        double d2 = 5.8888888888888888D;
        float f1;
        f1 = (float) d2;
        System.out.println("double => flot");
        System.out.println("d2: " + d2);
        System.out.println("f1: " + f1);
        int i2 = (int) d2;
        System.out.println("i2: "+i2);

        System.out.println("\nExemplo de Upcast");
        int i1 = 500;
        double d1;
        d1 = i1; // Upcast - não precida especificar o tipo do i1
        System.out.println("int => double");
        System.out.println("i1: " + i1);
        System.out.println("d1: " + d1);

        char c1= 'c';
        char c2='a';
        String st;
        st = String.valueOf(c1+""+c2);
        System.out.println("st:"+st);

    }
}
