package sept.ex_23092024;

import java.util.Scanner;

public class Task1_ifInputsAreGiven {
    public static void main(String[] args) {
// If inputs are given
        int a=12;
        int b=15;
        char ch='+';
        switch (ch) {
            case '+':
                System.out.println(a+b);
            case '-':
                System.out.println(a-b);
            case '*':
                System.out.println(a*b);
            case '/':
                System.out.println(a/b);
            case '%':
                System.out.println(a%b);
            default:
                System.out.println("Don't know which operation to perform");
        }
    }
}