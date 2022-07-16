package array;

import java.util.ArrayList;
import java.util.Arrays;

public class RemoveDuplicate {

    public static void main(String[] args) {
        ArrayList<Integer> arrlst = new ArrayList<>(Arrays.asList(1,3,5,7,9,8,7,6,5,3));
        ArrayList<Integer> arrlst2 = removeDuplicate(arrlst);
        System.out.println(arrlst2);
     }

    public static ArrayList<Integer> removeDuplicate(ArrayList<Integer> arrlst) {
        ArrayList<Integer> arrlst3 = new ArrayList<Integer>();

        for (Integer ele : arrlst){
            if(!arrlst3.contains(ele)){
                arrlst3.add(ele);
            }

        }
        return arrlst3;
    }
}
