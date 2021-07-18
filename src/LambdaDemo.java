interface MyLambda
{
    public void display();
}

class UseLambda
{
    public void callLambda(MyLambda ml)
    {
        ml.display();
    }
}

class Demo{


    public void method1()
    {
        UseLambda ul = new UseLambda();
        ul.callLambda(()->{
            System.out.println("Hello");
        });
    }
}



public class LambdaDemo {
    public static void main(String[] args) {
        Demo d = new Demo();
        d.method1();
    }
}
