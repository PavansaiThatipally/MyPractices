public class lcmHcf {
    public static void main(String[] args) {
        int n1=6,n2=10;int factor=0;
        for(int i=1;i<=n1;i++){
            if(n1%i==0 && n2%i==0){
                factor=i;
            }
        }
     System.out.println("HCF is "+factor);
     System.out.println("LCM is "+(n1*n2/factor));
    }
    
}
