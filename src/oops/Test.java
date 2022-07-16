package oops;
class Test
{/*
    static int a = 10;
    static int b;
    static void fun(){
        a=2;
        b = a * 4;
    }
}
class MCQ{
    public static void main(String[] args)
    {
        Test t=new Test();
        t.fun();
        System.out.print(Test.a+Test.b);
    }*/


    static int a = 10;
    int b = 20;
    static void fun1()
    {
        a = 20;                             //Line 1
      //  b = 10;                             //Line 2
       // fun2();                             //Line 3
       // System.out.print(this.b);           //Line 4
    }
    void fun2()
    {
        System.out.println("from m2");
    }
}
class MCQ{
    public static void main(String[] args)
    {
        Test.fun1();
    }
}