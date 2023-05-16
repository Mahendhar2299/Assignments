package com.blz.Day1;

import java.util.Scanner;

public class stringequals {
    public static void main(String[] args) {
        Scanner stringValue = new Scanner(System.in);
        System.out.println("Enter string1 for compare: ");
        String string1 = stringValue.nextLine();
        System.out.println("Enter string2 for compare: ");
        String string2 = stringValue.nextLine();
        if (string2.equals(string1)) {
            System.out.println("both Strings are equal");
        } else {
            System.out.println("both Strings are not equal");
        }
    }
}
