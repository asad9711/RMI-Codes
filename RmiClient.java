// import my.
import java.rmi.*;
import java.rmi.server.*;

public class RmiClient
{
public static void main(String s[])
{
	try{
	MyRemote m=(MyRemote)Naming.lookup("rmi://localhost:6700/asad");
	System.out.println(m.add(10,10));
}catch(Exception e)
{
	System.out.println(e);
}
}
}