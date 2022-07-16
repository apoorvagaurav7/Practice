package string;

public class RemoveCharacterFromString {
    public static void main(String[] args) {
        String str= "aabccbaa";
        char ch = 'a';
        String res=removeAllOccurrencesOfChar(str,ch);
        System.out.println(res);

    }

    private static String removeAllOccurrencesOfChar(String str, char ch) {
       String s="";
        for(int i=0;i<str.length();i++){
            if(str.charAt(i)!=ch){
                s+=str.charAt(i);
            }
        }
        return s;
    }

}
