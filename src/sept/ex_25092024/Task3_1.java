package sept.ex_25092024;

public class Task3_1 {
    public static void main(String[] args) {
        //Prime number from 1 to 100 using For loop
        int i,m=0,flag=0;
        int n=3;
        m=n/2;
        if(n==0 || n==1){
            System.out.println(n+"is not a prime number");}
        else{
            for(i=2;i<=m;i++){
                if(n%i==0){
                    System.out.println(n+" is not a prime number");
                    flag=1;
                    break;
                }
            }
        if(flag==0)   {
            System.out.println(n+" is a prime number");
        }
        }
    }
    }

