import java.util.Scanner;

class UnderAgeException extends Exception{
    @Override
    public String getMessage() {
        return "You are not eligible because age is too low";
    }
}
class OverAgeException extends Exception{
    @Override
    public String getMessage() {
        return "You are not eligible because age is too high";
    }
}

public class CustomExceptionExample {
    public static void main(String[] args) {


        try{
            Scanner scaner=new Scanner(System.in);
            System.out.println("Enter you age");
            int age=scaner.nextInt();
            checkAge(age);
        } catch (UnderAgeException e) {
            System.out.println(e.getMessage());
        } catch (OverAgeException e) {
            System.out.println(e.getMessage());
        }

    }
    public static void checkAge(int age) throws UnderAgeException,OverAgeException{
        if (age<18){
            throw new UnderAgeException();
        }
        else if(age>60){
            throw  new OverAgeException();
        }
        else{
            System.out.println("You are eligible to apply");
        }
    }
}

