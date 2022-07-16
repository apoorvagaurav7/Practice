package java8.practice;

import java.util.ArrayList;

public class EvenNumber {
    public static void main(String[] args) {
        ArrayList<Integer> arrlst = new ArrayList<Integer>();
        arrlst.add(1);
        arrlst.add(10);
        arrlst.add(6);
        arrlst.forEach(n-> System.out.println(n));

        arrlst.forEach(n-> {if(n%2==0)
            System.out.println("Even numbers are -> "+n);
        } );
    }
}
