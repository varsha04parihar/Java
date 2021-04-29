package Day1;
class Abc
{
	int aa=10,bb=10;
	static int cc=50;
	public void name() {
		int c=5;
		System.out.println(c);
		
	}
}
public class OperatorDemo {

	public static void main(String args[])
	{
		int a=100;
		System.out.println(a++);
		System.out.println(++a);
		System.out.println(a--);
		System.out.println(--a);
		System.out.println(a);
		
		int x=10;
		int y=2;
		System.out.println(x+y);
		System.out.println(x-y);
		System.out.println(x*y);
		System.out.println(x/y);
		System.out.println(x%y);
		
		
		System.out.println((x>y)?x:y);
		
		
		Abc abc=new Abc();
		abc.name();
		System.out.println(Abc.cc);
	}
}
