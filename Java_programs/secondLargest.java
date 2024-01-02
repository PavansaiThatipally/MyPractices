public class secondLargest {
    public static void main(String[] args) {
        int a[]={12,22,33,5,88,45,65};
        int largest=a[0];int t=0;
        int secondLargest=a[0];
        for(int i=0;i<a.length;i++){
                 if(a[i]>largest){
                    secondLargest=largest;
                    largest=a[i];
                 }else if(a[i]>secondLargest){
                    secondLargest=a[i];
                 }
        }
        for(int i=0;i<a.length;i++){
            for(int j=i+1;j<a.length;j++){
                if(a[i]<a[j]){
                    t=a[i];
                    a[i]=a[j];
                    a[j]=t;
                }
            }
        }
        System.out.println(a[17]);
        System.out.println(secondLargest);
    }
}
