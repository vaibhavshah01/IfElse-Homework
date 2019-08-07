import java.util.Scanner;
// program about interchange value of two numbers
public class Q5_Interchange_Value {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter 1st Number : ");
        int num1=scanner.nextInt();
        System.out.println("Enter 2nd Number : ");
        int num2=scanner.nextInt();
        // for interchange value we have use third variable as a hold the value while number interchange
        int interchange;
        scanner.close();
        interchange=num1;
        num1=num2;
        num2=interchange;
        System.out.println("now value interchange : " + " 1st number = "+ num1+" 2nd number = "+ num2);
    }
}
