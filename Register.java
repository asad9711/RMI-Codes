// package my;
import java.rmi.*;
import java.rmi.server.*;
public class Register  //Binding
{
	public static void main(String s[])
	{
		try{
			RmiServer m=new RmiServer();
			// Naming.rebind("rmi://localhost:6700/asad",m);
			Naming.rebind("asad",m);

		}catch(Exception e)
		{
			System.out.println(e);
		}
	}
}