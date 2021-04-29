package Day2;

public class StringDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//string ->literal way and new keyword
		char ch[]= {'a','b','c'};
		String str=new String(ch);
		System.out.println(str);
		
		String str2="hello";
				str2="there";
				System.out.println(str2);
				
		String s1 = "core";
        s1.concat(" java");
  
        System.out.println("s1 refers to " + s1);
        
        
        String s2 = "core";
        s2=s2.concat(" java");
  
        System.out.println("s2 refers to " + s2);

	}

}
