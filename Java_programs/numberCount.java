public class numberCount {
    public static void main(String[] args) {
        int a[]={1,32,4,5,4,1,3,1,2,1};
      //  int number[]=new int[a.length];
      int count;
        for(int i=0;i<a.length;i++){
             count=1;
            for(int j=i+1;j<a.length;j++){
                if(a[i]==a[j]){
                    count++;
                    a[j]=0;
                }
            }
            if(a[i]!=0){
                System.out.println(a[i]+" "+count);
            }
        }
    }
}
