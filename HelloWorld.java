package main.java.lezioni;

public class HelloWorld {

    // 1. public = visibilita
    // 2. static (opz)
    // 3. tipo di ritorno
    // 4. nome del metodo
    // 5. tipi (variabili) in input

//    public static void main(String[] args) {
//
//        System.out.println("Ciao Mondo");
//        System.out.println("Hello World");

//        System.out.println(somma(6, 7));
//        System.out.println(somma(4, 1));
//        System.out.println(sottrazione(50, 25));
//        System.out.println(isTrue(7, 8));
//
//        int a = 7;
//        int b = 14;
//        int c = 14;
//        int d = 14;
//
//        int prova = somma(a,b);
//        int prova2 = somma(c,d);
//
//        System.out.println(prova);
//        System.out.println(prova2);
//        System.out.println(prova + prova2);
//    }

//
//
//    TIPI DI DATO:
//    int = numero intero
//
//
//
//    private static int somma(int x, int y) {
//
//        int z = x + y;
//
//        int b = z * 7;
//
//        return b;
//    }
//
//    private static int sottrazione(int x, int y) {
//        int risultato = x- y;
//        return risultato;
//    }
//
//
//    private static int mopltiplicazione(int x, int y) {
//        int risultato = x * y;
//        return risultato;
//    }
//
//    private static int divisione(int x, int y) {
//        int risultato = x / y;
//        return risultato;
//    }
//
//    // variabili booleane
//    //true
//    //false
//    private static boolean isTrue(int x, int y) {
//
//        return x > y;
//    }
public static void main(String[] args) {

        int[] a = new int[10];
        int[] b = new int[10];
        for (int i = 0; i < 10; i++) {
            b[0]=1; b[i]=1;
            for (int j = 1; j < 1; j++) {
                b[j]=a[j]+a[j-1];
            }
            for (int j = 0; j < i; j++) {
                System.out.println(b[j]+"\t");
            }
                System.out.println();
                nomeMetodo(b,0,a,0,i+1);
        }
    }

    public static void nomeMetodo(Object src, int srcPos, Object dest, int destPos, int length) {
        if (src == null || dest == null) {
            throw new NullPointerException();
        }

        if (!(src instanceof Object[]) || !(dest instanceof Object[])) {
            throw new ArrayStoreException();
        }

        Object[] srcArray = (Object[]) src;
        Object[] destArray = (Object[]) dest;

        if (srcPos < 0 || destPos < 0 || length < 0 || srcPos + length > srcArray.length || destPos + length > destArray.length) {
            throw new IndexOutOfBoundsException();
        }

        System.arraycopy(srcArray, srcPos, destArray, destPos, length);
    }



}
