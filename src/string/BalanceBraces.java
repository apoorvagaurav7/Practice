package string;

import java.util.*;

public class BalanceBraces {


    static boolean arebracketsbalanced(String exp){
        Deque<Character> stack = new ArrayDeque<Character>();

        for(int i=0;i<exp.length();i++)
        {
            char x = exp.charAt(i);
            if(x == '(' || x == '[' || x == '{')
            {
                stack.push(x);
            }
            if(stack.isEmpty())
                return false;
            char temp;
            switch(x){
                case ')' :
                    temp = stack.pop();
                    if(temp == '{' || temp == '[')
                        return false;
                    break;
                case '}' :
                    temp = stack.pop();
                    if(temp == '(' || temp == '[')
                        return false;
                    break;
                case ']' :
                    temp = stack.pop();
                    if(temp == '(' || temp == '{')
                        return false;
                    break;

            }
        }
        return (stack.isEmpty());

    }

    public static void main(String[] args){
        String exp = "[(])";
        if (arebracketsbalanced(exp))
            System.out.println("Balanced");
        else
            System.out.println("Not Balanced");
    }

}
