public class numberPattern3 {
    public static void main(String[] args) {
        int n = 5, a = 5;
        for (int i = 1; i <= n; i++) {

            for (int j = a; j > 1; j--) {
                System.out.print(" ");
            }
            for (int k = i; k != 0; k--) {
                System.out.print(k);
            }
            a--;
            for (int j = 2; j <= i; j++) {
                System.out.print(j);
            }
            System.out.println("");
        }
    }
}