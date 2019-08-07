public class Q6_Employee_Income {
    // program about employee income and count his hra,da,pf,ta and gross salary
    public static void main(String[] args) {
        int id=123;
        System.out.println("Employee ID No.: " + id);
        String name="Vaibhav Shah";
        System.out.println("Employee Name : " + name);
        int salary= 51000;
        char p ='£';
        System.out.println("Basic Salary : " + p + salary);
        int a = 51000;
        int b = 100;
        int hra=a/b*10;
        int da=a/b*8;
        int ta=a/b*9;
        int pf=a/b*20;
        int gs=a+hra+da+ta-pf;
        System.out.println("Vaibhav's HRA is"+" = " + hra);
        System.out.println("Vaibhav's DA is" + " = "+ da);
        System.out.println("Vaibhav's TA is"+ " = " + ta);
        System.out.println("Vaibhav's PF is"+" = "+ pf);
        System.out.println("Vaibhav's Gross Salary is"+ " = "+gs);




    }
}
