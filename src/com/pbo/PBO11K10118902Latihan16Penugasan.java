package com.pbo;

/**
 *
 * #Author
 * Nama : Agung Sepruloh
 * Kelas : PBO11K
 * NIM : 10118902
 * 
 */

public class PBO11K10118902Latihan16Penugasan {

    public static void main(String[] args) {
	    int a = 10;
	    int b = 20;
	    int c = 0;

        System.out.println("Nilai a = " + a);
        System.out.println("Nilai b = " + b);
        System.out.println("Nilai c = " + c + "\n");

        c = a + b;
        System.out.println("c = a + b = " + c);
        c += a;
        System.out.println("c += a = " + c);
        c -= a;
        System.out.println("c -= a = " + c);
        c *= a;
        System.out.println("c *= a = " + c);

        a = 10;
        c = 15;
        c /= a;
        System.out.println("c /= a = " + c);

        a = 10;
        c = 15;
        c %= a;
        System.out.println("c %= a = " + c);

        c <<= 2;
        System.out.println("c <<= 2 = " + c);
        c >>= 2;
        System.out.println("c >>= 2 = " + c);
        c >>= 2;
        System.out.println("c >>= 2 = " + c);
        c &= a;
        System.out.println("c &= a = " + c);
        c ^= a;
        System.out.println("c ^= a = " + c);
        c |= a;
        System.out.println("c |= a = " + c);
    }
}
