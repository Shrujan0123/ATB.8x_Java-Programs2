package sept.ex_20092024;

import java.sql.SQLOutput;

public class Task1 {
    public static void main(String[] args) {
        int a=10;
        int b=20;
        int c=45;
        int max=(a>b)?(a>c?a:c):(b>c?b:c);
        System.out.println(max);
    }
}
