public class unique {
    public static void main(String[] args) {
        int a[]={1,3,1,2,4,2,1,3,4,5};
       int b[]=new int[a.length];
        for(int i=0;i<a.length;i++){
            int n=0; 
            for(int j=i+1;j<a.length;j++){
                if(a[i]!=a[j]){
                    n++;
                    a[j]=b[i]++;
                }
            }
            if(n==0){
                //System.out.println(a[i]);
               // break;
            }
        }
        for(int i=0;i<a.length;i++){
            if(a[i]!=000){
                System.out.println(a[i]);
            }
        }
       // System.out.println(n);
        
    }
}
