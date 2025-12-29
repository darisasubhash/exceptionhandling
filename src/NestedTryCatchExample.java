import java.util.Scanner;

public class NestedTryCatchExample {
    public static void main(String[] args) {
        try {
            Scanner scanner=new Scanner(System.in);
            System.out.println("Enter the String");
            String string = scanner.nextLine();
            try {
                System.out.println(string.charAt(10));
            } catch (StringIndexOutOfBoundsException e) {
                System.out.println("Inner catch: Invalid string index");
            }

            int number = Integer.parseInt(string);

        } catch (NumberFormatException e) {
            System.out.println("Outer catch: Invalid number format");
        }

    }
}
