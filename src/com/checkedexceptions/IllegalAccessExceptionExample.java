package com.checkedexceptions;

class Access{

    private Access(){}
}

public class IllegalAccessExceptionExample {
    public static void main(String[] args) {

        try{
            Access ace= Access.class.getDeclaredConstructor().newInstance();
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println(e.getMessage());
        }
    }
}
