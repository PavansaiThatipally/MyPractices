public class count {
    public static void main(String[] args) {
        String s = "welcome to java session java to session";
        String[] words = s.split(" ");
        for (int i = 0; i < words.length; i++) {
           int c = 1;
         if(words[i]!=null){
              for (int j = i + 1; j < words.length; j++) {
                if (words[i].equals(words[j])) {
                    words[j] =null;
                    c++;
                }

            }
            if (words[i] !=null) {
                System.out.println(words[i]+" "+c);
            }
         }
          
        }
    }
}
