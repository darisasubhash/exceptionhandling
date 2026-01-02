package com.checkedexceptions;

import java.text.ParseException;
import java.text.SimpleDateFormat;

public class ParseExceptionExample {
    public static void main(String[] args) {
        SimpleDateFormat date =new SimpleDateFormat("dd/MM/yyyy");
        try{
            date.parse("32/13/2025");
        } catch (ParseException e) {
            e.printStackTrace();
            System.out.println(e.getMessage());
        }
    }
}
