import java.util.Scanner;
// program about user input single character from alphabet and print that it's vowel or consonant
public class Q16_Vowel_Consonant {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input an alphabet  : ");
        Character ch = scanner.next().charAt(0);
        if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u'||ch=='A'||ch=='E'||ch=='I'||ch=='O'||ch=='U') {
            System.out.println("Input letter is Vowel");
        }
        else{
            System.out.println("Input letter is Consonant");
        }
    }
}
