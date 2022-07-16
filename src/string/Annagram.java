package string;

import java.util.Arrays;

public class Annagram {
    String s1 = "cab";
    String s2 = "abc";

    // cat,act ==> true

    // cat, acct ==> false
    // caat, acct ==> faalse


    public boolean check (String s1,String s2){
        // u r logic
        char[] str1 = s1.toCharArray();
        char[] str2 =s2.toCharArray();

        if(str1.length != str2.length)
            return false;
        Arrays.sort(str1);
        Arrays.sort(str2);
        for (int i=0;i<str1.length;i++)
            if(str1[i] != str2[i])
                return false;
        return true;
    }


}
