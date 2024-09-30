package sept.ex_25092024;

public class Task2_1 {
    public static void main(String[] args) {
        // Factorial from nos. 1 to 5 using For loop
        int i=1,fact=1;
        int number=5;
        for(i=1;i<=number;i++) {
            fact = fact * i;
        }
        System.out.println("Factorial of " +number+" is: " +fact );

        }
    }
