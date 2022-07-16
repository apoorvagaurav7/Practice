package string;

public class ReverseWordWise {

    public static String reverse(String str){
        String res[]=str.split(" ");
        String s="";
        for(int i=0;i<res.length;i++){
            if(i== res.length-1)
                 s = res[i] + s;
            else
                s =" " + res[i] + s;
        }
       return s;
    }


    public static void main(String[] args) {
        String str="Welcome to Coding Ninjas";
       String result= reverse(str);
        System.out.println(result);
    }
}
