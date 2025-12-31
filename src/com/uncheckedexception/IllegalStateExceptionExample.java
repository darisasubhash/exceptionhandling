package com.uncheckedexception;

import java.util.ArrayList;
import java.util.Iterator;

public class IllegalStateExceptionExample {
    public static void main(String[] args) {
        Iterator<Integer> it=new ArrayList<Integer>().iterator();
        try{
            it.remove();
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println(e.getMessage());
        }
    }
}
