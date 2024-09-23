package sept.ex_20092024;

public class Task3 {
    public static void main(String[] args) {
        int side1 = 3;
        int side2 = 3;
        int side3 = 3;
        if (side1==side2 && side2== side3) {
            System.out.println("Triangle is equilateral");
        } else if (side1==side2 && side2!=side3) {
                System.out.println("Triangle is isosceles");
        }else{
            System.out.println("Triangle is scalene");
        }
    }
    }