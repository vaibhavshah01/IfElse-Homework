import java.util.Scanner;

public class Q7_Average_Of_Five {
    // program about average of five number using scanner
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the first number : ");
        int num1=scanner.nextInt();
        System.out.print("Enter the second number : ");
        int num2=scanner.nextInt();
        System.out.print("Enter the third number : ");
        int num3=scanner.nextInt();
        System.out.print("Enter the fourth number : ");
        int num4=scanner.nextInt();
        System.out.print("Enter the fifth number : ");
        int num5=scanner.nextInt();
         int average;
         scanner.close();
         // first add all five number and then divide with 5 to get average
         average=num1+num2+num3+num4+num5;
         average=average/5;
        System.out.println("Average of these number :" + average);


    }
}
