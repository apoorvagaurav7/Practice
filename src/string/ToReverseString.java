package string;

public class ToReverseString {
    public static String s = "apoorva";
    public static void main(String[] args) {
        /**
         * using StringBuilder
         */
        StringBuilder s1 = new StringBuilder();
        System.out.println(s);
        s1.append(s);
        s1.reverse();
        System.out.println(s1);

        /**
         * By converting string into chararray
         */
        char[] c= s.toCharArray();
        System.out.println("chararray " +c);
        for (int i=c.length-1; i>=0;i--)
            System.out.print(c[i]);

    }
}
