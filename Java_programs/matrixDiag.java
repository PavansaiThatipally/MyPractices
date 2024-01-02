import java.util.Scanner;

public class matrixDiag {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the no.of rows");
        int n=sc.nextInt();
        System.out.println("enter the no.of columns");
        int m=sc.nextInt();
        System.out.println("Enter the array elements");
        int a[][]=new int[n][m];
        for(int i=0;i<a.length;i++){
            for(int j=0;j<a.length;j++){
                a[i][j]=sc.nextInt();
            }
        }
        int sum1=0,sum2=0;
        for(int i=0;i<a.length;i++){
            sum1+=a[i][i];
            sum2+=a[i][n-1-i];
        }
        System.out.println("output");
        int sum3=Math.abs(sum2-sum1);
        System.out.println(sum3);
    }
}
