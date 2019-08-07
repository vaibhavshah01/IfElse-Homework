public class Q9_Sales_Commission {
// program about calculate salesman commission from his sales amount
    public static void main(String[] args) {
        int id=456;
        String name="Raj";
        int salesAmount= 15000;
        int salary=10000;
        int a=100;
        int commission=salesAmount/a;
        System.out.println("Seller's Name :"+ name);
        System.out.println("Raj's ID : "+ id);
        System.out.println("Raj's Sales Amount :"+ salesAmount);
        System.out.println("Raj's salary :"+ salary);
        if (salesAmount>=50000){
            System.out.println("Raj's Commission : "+ commission*35);
        }
        else if (salesAmount>=30000){
            System.out.println("Raj's Commission : "+ commission*20);
        }
        else if(salesAmount>=20000){
            System.out.println("Raj's Commission : "+ commission*10);
        }
        else if (salesAmount>=10000){
            System.out.println("Raj's Commission : "+ commission*5);
        }
        else if (salesAmount<10000){
            System.out.println("Raj's Commission : "+ commission*2);

        }

    }
}
