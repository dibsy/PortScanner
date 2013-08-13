import java.net.*;
public class ScanThread implements Runnable{
	
	private String ip;
	private int startport;
	private int endport;
	
	

	public ScanThread(String ip,int startport,int endport)
	{
		this.ip=ip;
		this.startport=startport;
		this.endport=endport;
	}
	
	public void run()
	{
		

		try{
			InetAddress loadd=InetAddress.getLocalHost();//local address
			InetAddress readd=InetAddress.getByName(ip);
			System.out.println("Resolving ip to hostname"+readd.getHostName());
			for(int i=startport;i<=endport;i++)
			{
				PortScan scan=new PortScan(ip,i);
				scan.start();
			}
		}catch(Exception e)
		{
			System.out.println("Error at Scan Thread");
		}
	}
	
	
	
}
