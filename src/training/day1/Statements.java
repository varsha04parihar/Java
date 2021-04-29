package Day1;

public class Statements {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Looping Statement\n");

		System.out.println("simple loop");

		 for(int i=1;i<=10;i++)
		 {  
		        System.out.println(i);  
		 }
			System.out.println("\n");

		System.out.println("nested loop");
		
		for(int i=1;i<=3;i++)
			{  
				for(int j=1;j<=3;j++)
				{  
			        System.out.println(i+" "+j);  
				} 
			}
		System.out.println("\n");
		
		System.out.println("while loop");
		int n = 3;
		while(n<5)
		{
		System.out.println(n);
		n++;
		}
		System.out.println("\n");


		System.out.println("do while loop");
		int no = 1;
		do
		
		{
			System.out.println("Inside do loop the no is "+no);
			no++;
		}
		
		while (no<=1);
		
		System.out.println("\n");
		System.out.println("If Statement");
		int age=20;  
	    if(age>18){  
	        System.out.print("Age is greater than 18");  
	    } 
		System.out.println("\n");

	    
	    System.out.println("\n");
		System.out.println("If-else Statement");
		int a=17;  
	    if(a>18){  
	        System.out.print("Age is greater than 18");  
	    }  
	    else
	    {
	    	System.out.println("Age is less than 18");
	    }
		System.out.println("\n");


		  System.out.println("\n");
			System.out.println("nested If-else Statement");
		 int marks=65;  
	      
		    if(marks<50){  
		        System.out.println("fail");  
		    }  
		    else if(marks>=50 && marks<60){  
		        System.out.println("D grade");  
		    }  
		    else if(marks>=60 && marks<70){  
		        System.out.println("C grade");  
		    }  
		    else if(marks>=70 && marks<80){  
		        System.out.println("B grade");  
		    }  
		    else if(marks>=80 && marks<90){  
		        System.out.println("A grade");  
		    }else if(marks>=90 && marks<100){  
		        System.out.println("A+ grade");  
		    }else{  
		        System.out.println("Invalid!");  
		    }  
	
		    System.out.println("\n");
			System.out.println("Break");
		    int i = 0;
		    while (i < 10) {
		      System.out.println(i);
		      i++;
		      if (i == 4) {
		        break;
		      }
		    }
		    
		    System.out.println("\n");
			System.out.println("Continue");
		    int j = 0;
		    while (j < 10) {
		      if (j == 4) {
		        j++;
		        continue;
		      }
		      System.out.println(j);
		      j++;
		    }

	}

}
