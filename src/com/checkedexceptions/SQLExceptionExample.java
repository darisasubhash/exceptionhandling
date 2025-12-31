package com.checkedexceptions;

import java.sql.DriverManager;
import java.sql.SQLException;

public class SQLExceptionExample {
    public static void main(String[] args) {
        try{
            DriverManager.getConnection("jdbc:mysql://localhost:3036/name","root","root");
        } catch (SQLException e) {
            e.printStackTrace();
            System.out.println(e.getMessage());
        }

    }
}
