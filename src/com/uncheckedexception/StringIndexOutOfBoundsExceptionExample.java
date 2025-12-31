package com.uncheckedexception;

public class StringIndexOutOfBoundsExceptionExample {
    public static void main(String[] args) {
        String s="string";
        try{
            System.out.println(s.charAt(7));
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println(e.getMessage());
        }
    }
}
