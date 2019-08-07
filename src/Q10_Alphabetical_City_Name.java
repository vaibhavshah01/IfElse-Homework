import java.util.Scanner;

public class Q10_Alphabetical_City_Name {
    //program about type alphabet and print city name
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter any alphabet from lowercase a to f : ");
        char ch = scanner.next().charAt(0);

        if (ch == 'a') {
            System.out.println("Abu");
        }
        else if(ch=='b'){
            System.out.println("Bombay");
        }
        else if(ch=='c'){
            System.out.println("Calcutta");
        }
        else if(ch=='d'){
            System.out.println("Delhi");
        }
        else if(ch=='e'){
            System.out.println("Edinburgh");
        }
        else if (ch=='f'){
            System.out.println("Faridabad");
        }
        else{
            System.out.println("Invalid entry");
        }

    }
}