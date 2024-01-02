public class palindromeNum{

public static void main(String[] args) {
    int n=1211;int rem=0;int temp=0,limit=50;
    for(int i=1;i<=limit;i++){
         n=i;
    
    while(n>0){
        rem=n%10;
        temp=temp*10+rem;
        n=n/10;
    }

    if(temp==i){
        System.out.println("palindrome"+i);
    }
    temp=0;
}
}
}