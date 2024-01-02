public class number {
    public static void main(String args[]){
        int n=5;
        int a=1;
        for(int i=1;i<=8;i++){
            while(a<=i){
             System.out.print(a);
             a++;
            }
            a--;
            while(a>1){
                System.out.print(--a);
            }
             System.out.println(" ");
        }
       
    }
}
