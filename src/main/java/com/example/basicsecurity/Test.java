package com.example.basicsecurity;

public class Test {
    public static void main(String[] args) {
        ykkim();

    }

    private static void ykkim() {
        extracted();
    }

    private static void extracted() {
        String msg = getString();
        System.out.println(msg);
        System.out.println(msg);
    }

    private static String getString() {
        String msg = String.format("%d + %d = %d", 1, 2, 1 + 2);
        return msg;
    }


    public static void aaa(int x) {
        System.out.println(x);
    }
}
