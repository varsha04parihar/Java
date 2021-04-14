import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionTryCatchDemo {
    public static void main(String[] args) {
       try {
           int a[] = new int[2];
           a[0] = 25;
           a[1] = 0;
           a[2]= 45;//arrayoutofbound exception
           //a[1] = a[0] / a[1];//arithmatic exception
           String str=null;
           //System.out.println("Length of string :"+str.length());//nullptr exception
           String str2= "ABC";
           /*for(int i=0;;i++)//stringindexoutofbound exception
           {
               char ch=str2.charAt(i);
               System.out.println(ch);
           }*/
           try (Scanner s = new Scanner(System.in)) {
               System.out.println("Enter a no:");
               int no = s.nextInt();
           }
           catch (InputMismatchException e)
           {
               System.out.println(e);
           }

       }
       catch (ArithmeticException e)
       {
           System.out.println(e);
       }
       catch (ArrayIndexOutOfBoundsException e)
       {
           System.out.println(e);
       }

       catch(NullPointerException e)
       {
           System.out.println(e);
       }
       catch (StringIndexOutOfBoundsException e)
       {
           System.out.println(e);
       }
        System.out.println("Rest of the code");
    }
}
