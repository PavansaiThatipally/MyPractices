public class matrixAdd {
    public static void main(String[] args) {
        int a[][]={{1,2,3,},{4,5,6},{7,8,9}};
        int b[][]={{1,2,3},{1,2,3},{7,8,9}};
        int c[][]=new int[3][3];
        if(a.length==b.length && a[0].length==b[0].length){
            for(int i=0;i<a.length;i++){
                for(int j=0;j<a.length;j++){
                    c[i][j]=a[i][j]+b[i][j];
                    System.out.print(c[i][j]+" ");
                }
                System.out.println("");
            }
        }else{
            System.out.println("A and B matrix are not same");
            return;
        }
        //  for(int i=0;i<a.length;i++){
        //         for(int j=0;j<a.length;j++){
        //            System.out.print(c[i][j]+" ");
        //         }
        //         System.out.println("");
        //     }
    }
    
}
