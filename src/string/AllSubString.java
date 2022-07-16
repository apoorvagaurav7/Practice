package string;

public class AllSubString {

    public static void substring(String str){
        String rs=null;
        for(int i=0;i<str.length();i++) {
            for (int j = i; j < str.length()+1; j++) {
                System.out.println(str.substring(i, j));
            }
        }
    }

    public static void main(String[] args) {
        String str ="apoorva";
        substring(str);

    }
}
