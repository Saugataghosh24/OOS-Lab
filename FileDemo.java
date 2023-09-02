import java.io.DataOutputStream;
import java.io.*;

public class FileDemo {

	public static void main(String args[])
	{
		DataOutputStream dos=null;
		
		try
		{
			dos=new DataOutputStream(new BufferedOutputStream(new FileOutputStream("C:\\BE IT\\4th Sem\\OOS Lab\\Programs\\Dest2.txt")));
			
			dos.writeInt(5);
		}
		
		catch(IOException e)
		{
			System.out.println("Exception caught");
		}
	}
}