import java.util.Scanner;

public class TryCatchExample {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number1");
        int number1 = scanner.nextInt();
        System.out.println("Enter number2");
        int number2 = scanner.nextInt();
        int result=0;
        try {
            result=number1/number2;
            System.out.println(result);
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("Division by zero is not possible");
        }
    }
}
