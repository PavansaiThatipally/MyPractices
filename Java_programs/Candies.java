import java.util.Scanner;

public class Candies {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the no of test cases: ");
        int t=sc.nextInt();
        int a[]=new int[t];
      //  System.out.println("enter the array");
        int i=0;
        while(t>=0){
            int n=sc.nextInt();
            int m=sc.nextInt();
            int s=sc.nextInt();
            int last=((m-1)+(s-1))%n+1;
            a[i]=last;
            i+=1;
        }
        sc.close();
        for(int j=0;j<a.length;i++){
            System.out.println(a[j]);
        }
    }
}
