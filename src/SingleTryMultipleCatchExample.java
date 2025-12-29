import java.util.Scanner;

public class SingleTryMultipleCatchExample {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter the length of array");
        int n=scanner.nextInt();
        int[] array=new int[n];
        System.out.println("Enter array Elements");
        for(int i=0;i<array.length;i++){
            array[i]=scanner.nextInt();
        }
        try {
            array[3]=20;
            System.out.println(array[2]/0);
            String s=null;
            System.out.println(s.length());

        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Array Index out of Bounds Exception Occured");
            e.printStackTrace();
        }
        catch (ArithmeticException e){
            System.out.println("Arithmetic exception occured");
            e.printStackTrace();
        }
        catch (Exception e) {
            System.out.println("Exception occured");
            e.printStackTrace();
        }
    }
}
