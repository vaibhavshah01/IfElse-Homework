import java.util.Scanner;
//program about find out number is odd or even using ternary operators
public class Q1_Odd_Even_Ternary {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.print("Enter a number : ");
        int num=scanner.nextInt();
        // if number divide by 2 is a even number and not divide by 2 is odd number
        String evenOdd= (num%2==0)? "even":"odd";
        System.out.println(num + " is " + evenOdd + " number");
    }
}

