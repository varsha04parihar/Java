package Day1;
class Check
{
	int number=50;
	public void numberChecker()
	{
		
	
		switch (number=number/2) 
		{
	      case 29:
	        System.out.println("*******29*********");
	        break;

	      case 25:
	          System.out.println("*******42*********");
	        break;

	      case 44:
	          System.out.println("*******44*********");
	        break;
	      default:
	          System.out.println("*******Not found*********");

	        break;
		}
		  
	}
}


public class Switchcondition {
	public static void main(String args[])
	{
	int number = 87;
    

    // switch statement to check size
    

    if(number<50)
    {
    	switch (number) {
      case 29:
        System.out.println("*******29*********");
        break;

      case 42:
          System.out.println("*******42*********");
        break;

      case 44:
          System.out.println("*******44*********");
        break;
    }
     
    }
    else
    {
    	switch (number) {
      
      default:
          System.out.println("*******Not found*********");

        break;

    }
  }
    
    Check c=new Check();
    c.numberChecker();
}
}
