import java.io.IOException;


class UserValidation
{
    public static void verify(int age) throws IOException,
            ArithmeticException, InterruptedException
    {
        if(age<18)
        {
            ArithmeticException ae=new ArithmeticException();
            System.out.println(ae+"  Age must be atleast 18");
            System.out.println("**************");

            InterruptedException ie=new InterruptedException();
            Thread.sleep(10000);
            System.out.println(ie);
            System.out.println("**************");
            IOException e=new IOException();
            throw e;
            //or write try or catch block
        }
    }
}
public class ThrowsDemo {
    public static void main(String[] args) {
        try
        {
            UserValidation.verify(10);

        }
        catch (Exception e)
        {
            System.out.println(e);
            System.out.println("Rest of the code");
        }
    }
}
