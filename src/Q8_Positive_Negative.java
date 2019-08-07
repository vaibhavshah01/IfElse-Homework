import java.util.Scanner;
// program about find out user enter number positive,negative or zero
public class Q8_Positive_Negative {
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number you want to check:");
        int num = scanner.nextInt();
        if(num > 0)
        {
            System.out.println("The given number "+num+" is Positive");
        }
        else if(num < 0)
        {
            System.out.println("The given number "+num+" is Negative");
        }
        else
        {
            System.out.println("The given number is "+num);
        }
    }
}

