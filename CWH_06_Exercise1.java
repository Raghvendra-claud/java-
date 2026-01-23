import java.util.Scanner;

public class CWH_06_Exercise1 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter marks of maths: ");
        int a = s.nextInt();

        System.out.print("Enter marks of physics: ");
        int b = s.nextInt();

        System.out.print("Enter marks of chemistry: ");
        int c = s.nextInt();

        System.out.print("Enter marks of english: ");
        int d = s.nextInt();

        System.out.print("Enter marks of P.ed: ");
        int e = s.nextInt();

        int percentage = ((a+b+c+d+e)/500)*100;
        System.out.println("your percentage is: ");
        System.out.println(percentage);
    }
}
