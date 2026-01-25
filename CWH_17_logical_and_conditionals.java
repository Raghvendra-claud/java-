import java.util.Scanner;

public class CWH_17_logical_and_conditionals {
    public static void main(String[] args) {
        System.out.println("Logical AND and OR");
        Scanner s = new Scanner(System.in);
        System.out.println("Enter number: ");
        int a = s.nextInt();
        // boolean a = true;
        // boolean b = false;
        // if(a == b){
        //     System.out.println("Yes");
        // }
        // else{
        //     System.out.println("No");
        // }
        if( a!= 0){
            System.out.println("enterd value is not Zero.");
        }
        else{
            System.out.println("Entered value is equals to Zero.");
        }
    }
}
