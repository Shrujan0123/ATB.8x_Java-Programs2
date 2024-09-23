package sept.ex_23092024;

import java.util.Scanner;

public class Task1_IfInputsAreNotGiven {
    public static void main(String[] args) {
// If inputs are not given
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter first number");
        int a=sc.nextInt();
        System.out.println("Enter second number");
        int b=sc.nextInt();
        System.out.println("Enter the operator");
        char operator=sc.next().charAt(0);
        switch (operator) {
            case '+':
                System.out.println("Add"+ (a+b));
                break;
            case '-':
                System.out.println("Sub"+ (a-b));
                break;
            case '*':
                System.out.println("Mul"+(a*b));
                break;
            case '/':
                System.out.println("Div"+(a/b));
                break;
            case '%':
                System.out.println("Mod"+a%b);
                break;
            default:
                System.out.println("Don't know which operation to perform");
                break;
        }
    }
}