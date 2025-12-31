package com.uncheckedexception;

public class ClassCastExceptionExample {
    public static void main(String[] args) {
        Object o="Hello";

        try{
            Integer num=(Integer) o;
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println(e.getMessage());
        }
    }
}
