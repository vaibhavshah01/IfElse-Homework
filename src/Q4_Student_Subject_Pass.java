public class Q4_Student_Subject_Pass {
   // program about student pass if he achieve minimum marks in all subjects
    public static void main(String[] args) {
        String name = "Vaibhav";
        System.out.println("Student Name :" + name);
        int roll = 52;
        System.out.println("Roll No. :" + roll);
        int maths = 60;
        int science = 70;
        int english = 90;

        int passAnySubject = 35;
        if (passAnySubject >= 35) {
            System.out.println("Result : "+ "Congratulations you Pass !");
        } else {
            System.out.println("Sorry you Fail.");
        }

    }
}
