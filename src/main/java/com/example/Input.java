package com.example;

import java.util.Scanner;

public class Input {
    private static Scanner sc;

    private Input() {}

    public static Scanner getInstance() {
        if(sc == null) {
            sc = new Scanner(System.in);
        }

        return sc;
    }

    public static void close() {
        if(sc != null) {
            sc.close();
        }
    }
}
