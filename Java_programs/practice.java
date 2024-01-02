import java.util.Scanner;

public class practice { 
    public static void main(String[] args) {
       
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the num:");
        int n=sc.nextInt();int r= 1;
        if(n==1 || n==0){
            System.out.println(1);
        }else{
           for(int i=0;i<n;i++){
            r=r*(n-i);

              
           }
      System.out.println(r);
        }
       
           
    }
}
