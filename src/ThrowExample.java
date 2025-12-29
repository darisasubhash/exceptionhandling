import java.util.Scanner;

public class ThrowExample {
    public static void main(String[] args) {
        try {
            checkEligibility();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        System.out.println("Program ended normally");
    }

    static void checkEligibility() {
        try {
            Scanner scanner=new Scanner(System.in);
            System.out.println("Enter the age");
            int age=scanner.nextInt();
            if (age < 18) {
                throw new ArithmeticException("Age is below 18");
            }
            System.out.println("Eligible to vote");
        } catch (Exception e) {
            System.out.println("Caught in checkEligibility");
            throw e;
        }
    }
}
