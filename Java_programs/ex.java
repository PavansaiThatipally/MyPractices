public class ex {
    public static void main(String[] args) {
        String str="hi bro i am a! billionare";
        String words[]=str.split(" ");
        for(int i=0;i<words.length;i++){
            if((words[i]==" ") || (words[i]=="1") || (words[i]=="?") || (words[i]==".") || (words[i]==",")){
                   System.out.println(words[i]);
            }
        }
    }
}
