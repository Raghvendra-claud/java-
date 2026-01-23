import java.util.Scanner;

public class CWH_05_takinginput {
    public static void main(String[] args) {
        System.out.println("it works");
        Scanner s = new Scanner(System.in);
        System.out.println("Enter first number: ");
        // int a = s.nextInt();
        float  a = s.nextFloat();

        System.out.println("Enter second number: ");
        // int b = s.nextInt();
        float b = s.nextFloat();

        float sum = a+b;
        System.out.println("Sum is: "+sum);

        s.nextLine();
        // String str = s.next();
        String str = s.nextLine();
        System.out.println(str);

        boolean b1 = s.hasNextInt();
        System.out.println(b1);
    }
}