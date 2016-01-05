package org.whybenormal;

public class Main {

    public static void main(String[] args) {
	// write your code here
        System.out.println("Hello World");

        System.out.println(PolyEval.UniVariate("5x^3 + x", 10));
        System.out.println(PolyEval.UniVariate("5.0x^3 + x", 10));
        System.out.println(PolyEval.UniVariate("-2x^3+10x-4x^2", 3));
        System.out.println(PolyEval.UniVariate("9.34444x^3+x^2+x", 6));
    }
}
