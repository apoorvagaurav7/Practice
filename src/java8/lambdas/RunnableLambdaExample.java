package java8.lambdas;

public class RunnableLambdaExample {
    public static void main(String[] args) {

        /**
         Legacy Way
         */
        Runnable runnable = new Runnable() {
            @Override
            public void run() {
                System.out.println("Inside runnable");
            }
        };
        new Thread(runnable).start();

        /**
         * Using Java 8
         */

        Runnable runnable1 = ()-> System.out.println("Inside runnable 1");
        new Thread(runnable1).start();

        /**
         * Java 8 more synthesise
         */

        new Thread(()-> System.out.println("inside runnable 3")).start();
        }

}
