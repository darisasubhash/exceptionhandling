import java.util.Scanner;

public class ThrowsExample {
    public static void main(String[] args) {
        try{
            calculateDivision();
        } catch (Exception e) {
            System.out.println("Exception occured");
            e.printStackTrace();
        }
    }
    public static void calculateDivision() throws Exception{
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter the number1");
        int num1= scanner.nextInt();
        System.out.println("Enter the number2");
        int num2= scanner.nextInt();
        int result=num1/num2;
        System.out.println(result);
    }
}
