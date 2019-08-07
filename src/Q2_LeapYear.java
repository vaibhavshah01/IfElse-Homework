import java.util.Scanner;
// program about find leap year using ternary operators
public class Q2_LeapYear {

    public static void main(String[] args) {

        Scanner scanner=new Scanner(System.in);

        System.out.print("Enter a year : ");
        int num=scanner.nextInt();
     // leap year must divide by 4 and 400 but can not divide by 100
        String leapYear=(num%4==0 && num%100!=0) ||(num%400==0)? "a leap year":" not a leap year";
        System.out.println(num + " is " + leapYear);
    }
}
