import java.util.Scanner;
// program about use add + symbol and get result addition of his two number
public class Q13_Symbol_Value_Print {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter 1st number : ");
        int num1=scanner.nextInt();
        System.out.println("Enter 2nd Number : ");
        int num2=scanner.nextInt();
        System.out.println("Enter the symbol : ");
        int num3=scanner.next().charAt(0);
        num3=num1+num2;

        if (num1+num2==num3){
            System.out.println("addition of two number :"+ num3);
        }

        }

    }

