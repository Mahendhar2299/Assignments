package com.blz.Day1;

import java.util.Scanner;

public class stringbycommandline {
    public static void main(String[] args) {
        Scanner stringname = new Scanner(System.in);
        System.out.println("Plz enter your name ");
        String name = stringname.nextLine();
        System.out.println("Hi " + name);
    }
}
