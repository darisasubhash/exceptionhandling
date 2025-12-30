import java.util.Scanner;

class AgeException extends RuntimeException{
    public AgeException(String message) {
        super(message);
    }
}
public class CustomExceptionExample {
    public static void main(String[] args) {
        try{
            Scanner scaner=new Scanner(System.in);
            System.out.println("Enter you age");
            int age=scaner.nextInt();
            checkAge(age);
        } catch (AgeException e) {
            System.out.println("Not Eligible : "+e.getMessage());
        }
    }
    public static void checkAge(int age) {
        if (age<18){
            throw new AgeException("Age is too low");
        }
        else if(age>60){
            throw  new AgeException("Age is too high ");
        }
        else{
            System.out.println("You are eligible to apply");
        }
    }
}

