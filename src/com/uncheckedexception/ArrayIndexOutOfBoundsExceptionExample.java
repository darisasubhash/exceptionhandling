package com.uncheckedexception;

public class ArrayIndexOutOfBoundsExceptionExample {
    public static void main(String[] args) {
        int[] array={1,2,3,4,5};
        try{
            System.out.println(array[6]);
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println(e.getMessage());
        }
    }
}
