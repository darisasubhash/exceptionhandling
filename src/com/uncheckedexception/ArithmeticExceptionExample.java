package com.uncheckedexception;

import java.util.Scanner;

public class ArithmeticExceptionExample {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter numerator");
        int numerator=scanner.nextInt();
        System.out.println("Enter denominator");
        int denominator=scanner.nextInt();
        try{
            System.out.println(numerator/denominator);
        } catch (Exception e) {
            System.out.println(e.getMessage());
            e.printStackTrace();
        }
    }
}
