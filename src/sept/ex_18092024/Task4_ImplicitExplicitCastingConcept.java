package sept.ex_18092024;

public class Task4_ImplicitExplicitCastingConcept {
    public static void main(String[] args){
        byte b=10;
        int a=b; // valid implicit casting (widening)
        System.out.println(a);
        int a1=(int)b; //valid explicit casting (narrowing)
        System.out.println(a1);
    }
}
