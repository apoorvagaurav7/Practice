package string;

public class ReverseEachWord {

    public static String reverseWord(String s){
        String ans="";
        int startwordindex=0;

        int i=0;
        for(;i<s.length();i++){
            if(s.charAt(i)==' '){
                int endwordindex=i-1;
                String temp="";
                for(int j=startwordindex;j<=endwordindex;j++){
                    temp=s.charAt(j)+temp;
                }
                ans+=temp + " ";
                startwordindex=i+1;
            }
        }
        int endwordindex=i-1;
        String temp="";
        for(int j=startwordindex;j<=endwordindex;j++){
            temp=s.charAt(j)+temp;
        }
        ans+=temp + " ";

        return ans;
    }
    public static void main(String[] args) {
        String str = "ab cd efg hijk";
        String res =reverseWord(str);
        System.out.println(res);

    }
}
