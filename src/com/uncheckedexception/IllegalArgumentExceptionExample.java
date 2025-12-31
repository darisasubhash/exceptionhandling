package com.uncheckedexception;

import java.util.Scanner;

public class IllegalArgumentExceptionExample {
    static void setUsername(String name) {
        if (name.length() < 5) {
            throw new IllegalArgumentException("Username must have at least 5 characters");
        }
        System.out.println("Username accepted");
    }
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter username");
        String name= scanner.nextLine();
        try{
            setUsername(name);
        }
        catch(Exception e){
            e.printStackTrace();
            System.out.println(e.getMessage());

        }
    }

}
