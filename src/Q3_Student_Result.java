public class Q3_Student_Result {
// program about student grade achieved +based on his percentage
    public static void main(String[] args) {
        String name = "Vaibhav";
        System.out.println("Student Name :" + name);
        int roll = 35;
        System.out.println("Roll No. :" + roll);
        int maths = 60;
        int science = 70;
        int english = 90;
        int total = (maths + science + english);
        System.out.println("Total marks of 3 subjects : "+ total);
        System.out.println("Total percentage is " + (100 * 220 / 300) + '%');
        int percentage = 73;
        if (percentage>=80){
            System.out.println("Grade Achieved : A+");
        }
        else if (percentage>=60){
            System.out.println("Grade Achieved : A ");
        }
        else if(percentage>=50){
            System.out.println("Grade Achieved : B");

        }
        else if (percentage>=35){
            System.out.println("Grade Achieved : C");

        }
        else if (percentage<35){
            System.out.println("fail");
        }
        else{
            System.out.println("Invalid");
        }

    }
}