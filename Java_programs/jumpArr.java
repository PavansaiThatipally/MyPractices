import java.util.Scanner;

public class jumpArr {

    public static boolean jump(int num[]){
        int maxReach=0;
        for(int i=0;i<num.length;i++){
            if(i>maxReach){
                return false;
            }
            maxReach=(i+num[i]>maxReach)?i+num[i]:maxReach;
            if(maxReach>=num.length-1){
                return true;
            }
        }
        return false;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the array size");
        int n=sc.nextInt();
        int a[]=new int[n];
        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
        }
        System.out.println(jump(a));
    }
}
