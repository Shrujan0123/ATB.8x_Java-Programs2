package sept.ex_20092024;

public class Task2 {
    public static void main(String[] args) {
        int score = 85;
        char grade = 'B';
        if (score >= 90) {
            grade = 'A';
        } else if (score >= 80 && score < 90) {
            grade = 'B';
        } else if (score >= 70 && score < 80) {
            grade = 'C';
        } else {
            grade = 'D';
        }
        System.out.println("Your grade is " + grade);
    }
}