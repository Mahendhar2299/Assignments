package com.blz.Day1;

import java.util.Scanner;

public class usingstatic {
    Scanner scanner = new Scanner(System.in);
    static int number1 = 5;

    static {
        System.out.println("Static block can be used print any msg in the top of code ");
        System.out.println("static block");
    }

    static void square() {
        int square = number1 * number1;
        System.out.println("static method");
        System.out.println(square);
    }

    public static void main(String[] args) {

        square();
    }
}
