package com.uncheckedexception;

public class NumberFormatExceptionExample {
    public static void main(String[] args) {
        try{
            System.out.println(Integer.parseInt("Hello"));
        } catch (NumberFormatException e) {
            e.printStackTrace();
            System.out.println(e.getMessage());
        }
    }
}
