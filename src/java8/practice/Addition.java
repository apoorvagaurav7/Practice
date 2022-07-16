package java8.practice;

public class Addition implements Myinterface {

    @Override
    public int operation(int a, int b) {
        return 0;
    }

    public static void main(String[] args) {
        Myinterface addtion = (a,b) -> (a+b);
        System.out.println("addition = " +addtion.operation(2,3));

        Myinterface multiplication =(a,b)->(a*b);
        System.out.println("mutliplication = "+multiplication.operation(5,4));
    }
}
