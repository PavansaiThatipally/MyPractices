import java.util.Scanner;

public class vehicleTWFW {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the no. of vehicle ");
        int v=sc.nextInt();
        System.out.println("enter the no. of wheels");
        int w=sc.nextInt();
        int x=0;
        if(w<=2 || w%2!=0 || v>w ){
            System.out.println("invalid input");
        }else{
            x=(v*4-w)/2;
            System.out.println("TW :"+x+" "+"FW :"+(v-x));
        }
    }
}
