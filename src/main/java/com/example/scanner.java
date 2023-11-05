package com.example;

import java.util.Scanner;

public class scanner {
    private static Scanner sc;

    private scanner() {
    }

    public static Scanner getInstance() {
        if (sc == null) {
            sc = new Scanner(System.in);
        }

        return sc;
    }

    public static void close() {
        if (sc != null) {
            sc.close();
        }
    }
}
