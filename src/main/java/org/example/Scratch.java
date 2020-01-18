package org.example;

public class Scratch {
    public static void main(String[] args) {
        System.out.println("1");
        doSomething();
        System.out.println("4");
    }

    private static void doSomething() {
        try {
            System.out.println("2");
            throw new RuntimeException();

        } finally {
            System.out.println("3");
        }
    }
}
