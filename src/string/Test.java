package string;

public class Test {
    public static int countWords(String str) {
        //Your code goes here
        int count =0;
        for(int i=0;i<str.length();i++){
            if(str.charAt(i)==' '){
                count ++;
            }
        }

        return count+1;
    }

    public static void main(String[] args) {
        /*String a ="abcda";
        String b="abcdg";
        System.out.println(a.compareTo(b));*/

       /* String a="coding";
        for(int i=2;i<4;i++)
        {
            System.out.print(a.substring(i));
        }*/
        String str = "i love my country";
       int n= countWords(str);
        System.out.println(n);
    }
}
