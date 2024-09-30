package sept.ex_25092024;

import java.io.IOException;

public class Task4_1 {
    public static void main(String[] args) {

        String alp = "Pramod";
        alp = alp.toLowerCase();
        int vcount = 0, ccount = 0;
        for (int i = 0; i < alp.length(); i++) {
            if (alp.charAt(i) == 'a' || alp.charAt(i) == 'e' || alp.charAt(i) == 'i' || alp.charAt(i) == 'o' || alp.charAt(i) == 'u') {
                vcount++;
            }
            else if (alp.charAt(i) >= 'a' && alp.charAt(i) <= 'z') {
                ccount++;
            }
        }
        System.out.println("Total no of vowels in String are: " + vcount);
        System.out.println("Total no of vowels in String are: " + ccount);
    }
}