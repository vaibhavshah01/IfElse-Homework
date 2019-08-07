import java.util.Scanner;
// program about check vote eligibility by checking age criteria
public class Q11_Vote_Age_Eligibility {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.print("Enter your age : ");
        int age=scanner.nextInt();
        // voters must be 18 years old or over !!
        if (age>=18){
            System.out.println("You are eligible for vote");
        }
        else{
            System.out.println("Sorry  you are not eligible for vote");
        }
    }
}
