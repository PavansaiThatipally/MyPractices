import java.util.Scanner;

public class Monkeys {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the number of monkeys");
        int n=sc.nextInt();
        System.out.println("enter the number of eatable bananas");
        int k=sc.nextInt();
        System.out.println("enter the number of eatable peanuts");
        int j=sc.nextInt();
        System.out.println("enter the number of bananas");
        int m=sc.nextInt();
        System.out.println("enter the number of peanuts");
        int p=sc.nextInt();
        int atenBanana=0;
        int atenPeanut=0;
        if(n<0 || k<0 || j<0 || m<0 || n<0){
            System.out.println("invalid inputs");
        }else{
            if(k>0){
                atenBanana=m/k;
            }
            if(j>0){
                atenPeanut=p/j;
            }
             n=n-atenBanana-atenPeanut;
           System.out.println(n);
        }
    }
}
