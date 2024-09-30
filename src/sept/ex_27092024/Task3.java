package sept.ex_27092024;

public class Task3 {
    public static void main(String[] args) {
        int a = 1;
        int sum = 1;
        while (a < 101) {
            sum = sum + a;
            a++;
        }
        System.out.println(+sum);
    }
}
