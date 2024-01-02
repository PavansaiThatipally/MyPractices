// public class reverseWord {
//     public static void main(String[] args) {
//         // String s="welcome to java";
//         // String words[]=s.split("");
//         // char c[]=s.toCharArray();
//         // for(int i=c.length-1;i>=0;i--){
//         //    // System.out.print(c[i]);
//         // }
//         // for(int i=words.length-1;i>=0;i--){
//         //     System.out.print(words[i]+" ");
//         // }

//     }
// }

import java.util.Scanner;

// class reverseWord
// {
//  static final int MAX_CHAR = 256;
//  static void getOccuringChar(String str)
//  {
//  int count[] = new int[MAX_CHAR];
//  int len = str.length();
//  for (int i = 0; i < len; i++)
//  count[str.charAt(i)]++;
//  char ch[] = new char[str.length()];
//  for (int i = 0; i < len; i++) {
//  ch[i] = str.charAt(i);
//  int find = 0;
//  for (int j = 0; j <= i; j++) {
//  if (str.charAt(i) == ch[j]) 
//  find++; 
//  }
//  if (find == 1) 
//  System.out.println("Number of Occurrence of " +
 
//  str.charAt(i) + " is:" + count[str.charAt(i)]); 
//  }
//  }
//  public static void main(String[] args)
//  {
//  Scanner sc = new Scanner(System.in);
//  String str = "geeksforgeeks";
//  getOccuringChar(str);
//  }
// }
class reverseWord{
    public static void main(String[] args) {
        String s="geeksforgeeks";
        String[] words=s.split("");
        for(int i=0;i<words.length;i++){
            int c=1;
            for(int j=i+1;j<words.length;j++){
                if(words[i].equals(words[j])){
                     c++;
                words[j]="0";
            }
                }
               
            if(words[i]!="0"){
                System.out.println("no. of occurences of "+words[i]+" is "+c);
            }
        }
    }
}