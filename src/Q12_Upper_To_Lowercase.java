import java.util.Scanner;
// program about turn uppercase alphabet into lowercase when print
public class Q12_Upper_To_Lowercase {
    public static void main(String[] args) {
        char ch;
        int temp;
        Scanner scanner=new Scanner(System.in);
        System.out.print("Enter Uppercase Alphabet : ");
        ch=scanner.next().charAt(0);
        temp=(int)ch;
        temp=temp +32;
        ch=(char)temp;
        System.out.println("Equivalent alphabet in lowercase : "+ ch);
    }
}
