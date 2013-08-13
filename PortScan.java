import java.net.*;
public class PortScan extends Thread
{
	
	public int port;
	public String ip;
	public PortScan(String ip,int port)
	{
		this.ip=ip;
		this.port=port;
	}
	
	public void run()
	{
		try
		{
			Socket so=new Socket(ip,port);
			System.out.println("Port "+port+"is open");
			so.close();
		}
		catch(Exception e)
		{
			
		}
	}
	public void scan()
	{
		
	}
}
