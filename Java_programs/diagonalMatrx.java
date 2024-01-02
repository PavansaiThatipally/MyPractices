public class diagonalMatrx {
    public static void main(String[] args) {
        int a[][]={{1,2,3},{2,3,4},{1,5,6}};
        int sum1=0;int sum2=0;
        int n=a.length;
        for(int i=0;i<a.length;i++){
            for(int j=0;j<a.length;j++){
                if(i==j){
                    sum1+=a[i][j];
                }
            }
        }
        for(int i=0;i<a.length;i++){
            for(int j=0;j<a.length;j++){
                if(i+j==2){
                    sum2+=a[i][j];
                }
            }
        }
        int sum3=Math.abs(sum1-sum2);
        System.out.println(sum3);
    }
}
