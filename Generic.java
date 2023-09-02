class Test1<T,U>
{
	T obj1;
	U obj2;
	
	Test1 (T obj1, U obj2)
	{
		this.obj1=obj1;
		this.obj2=obj2;
	}
	void print()
	{
		System.out.println(obj1);
		System.out.println(obj2);
	}
}


public class Generic {

	public static void main(String args[])
	{
		Test1<Integer, Integer> iob=new Test1<Integer, Integer> (10,20);
		iob.print();
		
		//Test1<Double, String> dob=new Test1<Double,String> (10.5, "JU IT");
		//dob.print();
		
		//Test1<String, Integer> sob=new Test1<String, Integer> ("OOS", 15);
		//sob.print();
		
		
	}
}
