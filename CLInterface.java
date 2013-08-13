import java.io.*;

public class CLInterface {
	
	//instance variables
	
	private int startport;
	private int endport;
	private String ip;
	
	//Standard Input Connection
	public static BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
	
	//User Input for ports and Ip
	public void getInput()
	{
		try
		{
			System.out.print("Enter a valid ip address:");
			ip=br.readLine();
			System.out.print("Enter start port:");
			startport=Integer.parseInt(br.readLine());
			endport=Integer.parseInt(br.readLine());
		}
		catch(Exception e)
		{
			System.out.println("Error at input:"+e.toString());
		}
	}
	
	
	public void send()
	{
		ScanThread st=new ScanThread(ip,startport,endport);
		st.run();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CLInterface  obj=new CLInterface();
		obj.getInput();
		obj.send();

	}

}
