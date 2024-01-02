public class prime {

    public static void main(String[] args) {
        int n = 50;int sum=0,count=1;

        
        for (int i = 2; i <= n; i++) {
            int flag = 0;
            for (int j = 2; j <= n; j++) {
                if (i % j == 0) {
                    flag++;
                    
                    sum+=i;
                }
            }
            if (flag == 1) {
                count++;
                System.out.print(i+" ");
            }
        }
        System.out.println(count);
         System.out.println(sum);
         System.out.println(sum/count);
    }
}
