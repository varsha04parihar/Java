package Day1;

public class PatternDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int rows = 5;

	    for (int i = 1; i <= rows; ++i) {
	      for (int j = 1; j <= i; ++j) {
	        System.out.print("* ");
	      }
	      System.out.println();
		}
	    
	      System.out.println();

	    
	    
	    for (int i = 0; i < 5; i++) 
	    {
	    	for (int j = 0; j < 5 - i; j++)
	    	{ 
	    		System.out.print(" "); 
	    	}
	    	for (int k = 0; k <= i; k++) 
	    	{
	    		System.out.print("* "); 
	    	}
	    	System.out.println();
	    }

	    
	    
 
	    
	    System.out.println();

	    
	    
	    for (int i = 0; i < 5; i++) 
	    {
	    	for(int j=2*(5-i); j>=0; j--)
	    	{ 
	    		System.out.print(" "); 
	    	}
	    	for (int k = 0; k <= i; k++) 
	    	{
	    		System.out.print("* "); 
	    	}
	    	System.out.println();
	    }

	    
	    
	    System.out.println();

	    for(int i = 5; i > 0; i--) 
	    {
            for(int j = i; j > 0; j--)
            {
                System.out.print("* ");
            }
            System.out.print("\n");
	    }
	    
	    

	    System.out.println();

	    for(int i = 5; i > 0; i--) 
	    {
	    	for(int j=2*(5-i); j>=0; j--)
	    	{ 
	    		System.out.print(" "); 
	    	}
            for(int j = i; j > 0; j--)
            {
                System.out.print("* ");
            }
            System.out.print("\n");
	    }
	    
	    

	}

}
