// package my;
import java.rmi.*;
import java.rmi.server.*;
public class RmiServer extends UnicastRemoteObject implements MyRemote
{
	public RmiServer()throws RemoteException
	{}
	public int add(int x,int y)throws RemoteException
	{
		return (x+y);

	}
}