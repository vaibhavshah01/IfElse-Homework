import java.util.Scanner;
// program about enter a value and find out it's number,alphabet or symbol
public class Q14_Number_Alphabet_Symbol {

    public static void main(String [] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a value to check : ");
        char char1 = scanner.next().charAt(0);
        if (char1 >= 48 && char1 <= 58) {
            System.out.print("The given value is a number ");

        } else if ((char1 >= 'a' && char1 <= 'z') || (char1 >= 'A' && char1 <= 'Z')) {
            System.out.print("The given value is an Alphabet");
        } else {
            System.out.print("The given value is a symbol");

        }
    }

}




