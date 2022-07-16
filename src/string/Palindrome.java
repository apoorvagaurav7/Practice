package string;

public class Palindrome {

    public static boolean ispalindrome(String str){
    int i=0,j=str.length()-1;
       while(i<str.length()){
           if(str.charAt(i)!=str.charAt(j)){
               return false;}
           else{
               i++;
               j--;
           }
           }return true;
       }

    public static void main(String[] args) {
        String str = "madam";
       boolean result= ispalindrome(str);
        System.out.println(result);
    }
}
