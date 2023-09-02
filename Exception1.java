
public class Exception1 {
	
	public static void main(String args[])
	{
		int d=2, res;				
		try
		{			
			res=100/d;	
			throw new ArithmeticException();//forcibly throw an exception, even though no                                                         exception arises
		}
		
		catch(Exception e)
		{
			System.out.println("catch block"); //must have to handle it
		}
	                    //error will be reported, as there is no handler to handle the exception
 
		finally
		{
			System.out.println("Finally block");
		}
		
		
		
	}

}