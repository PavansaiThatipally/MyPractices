
public class countWords {
    public static void main(String[] args) {
        String input = "Welcome to Java Session Java Session Session Java";
        String[] words = input.split(" ");
        int wrc = 1;
        for (int i = 0; i < words.length; i++) {
            for (int j = i + 1; j < words.length; j++) {
                if (words[i].equals(words[j])) {
                    wrc = wrc + 1;
                    words[j] = "0";
                }
            }
            if (words[i] != "0") {
                System.out.println(words[i] + " " + wrc);
                wrc = 1;
            }
        }
    }
}
//   String s="welcome";
//        String[] words=s.split("");
//        for(int i=0;i<words.length;i++){
//         int c=1;
//            for(int j=i+1;j<words.length;j++){
//               if(words[i].equals(words[j])){
//                 c++;
//                 words[j]="0";
//               }
              
//            }
//            if(words[i]!="0"){
//                 System.out.println(words[i]+" "+c);
//               }
//        }