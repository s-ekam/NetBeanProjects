package gtb_resources;

//import java.net.*;
//public class IpaddressDemo
//{
//	public static void main(String args[ ])
//	{
//		try
//		{
//			InetAddress local2= InetAddress.getLocalHost( );
//                        
//			System.out.println ("Local IP Address is :"+ local2);
//                        InetAddress address = InetAddress.getByName("java.sun.com");
//			System.out.println(address);
//		}
//		catch (Exception e)
//		{
//			System.err.println ("Can’t detect IP Address :" + e.getMessage());
//		}
//	}
//}
//
//
//
//import java.net.*;
//public class IPAddressExample 
//{
//	public static void main (String[ ] args)
//	{
//		try
//		{
//			InetAddress[ ] addresses = InetAddress.getAllByName(“www.yahoo.com”);
//			for (int i = 0; i < addresses.length; i++) 
//				System.out.println(addresses[i]);
//		}
//		catch (UnknownHostException e) 
//		{
//			System.out.println(“Could not find www.apple.com”);
//		}
//	}
//}
//
//import java.net.*;
//import java.io.*;
//public class URLReader 
//{
//	public static void main(String[ ] args) throws Exception 
//	{
//		URL yahoo = new URL(“http://www.yahoo.com/”);
//		BufferedReader in ; 
//		in = new BufferedReader(new InputStreamReader(yahoo.openStream( )));
//		String inputLine;
//		while ((inputLine = in.readLine( )) != null)
//			System.out.println(inputLine);
//		in.close( );
//	}
//}
//
//
//import java.net.*;
//import java.io.*;
//public class GreetingClient
//{
//	public static void main(String [ ] args)
//	{
//		String serverName = args[0];
//		int port = Integer.parseInt(args[1]);
//		try
//		{
//			System.out.println(“Connecting to” + serverName+ “on port” + port);
//			Socket client = new Socket(serverName, port);
//			System.out.println(“Just connected to” + client.getRemoteSocketAddress( ));
//			OutputStream outToServer = client.getOutputStream( );
//			DataOutputStream out = new DataOutputStream(outToServer);
//			out.writeUTF(“Hello from” + client.getLocalSocketAddress( ));
//			InputStream inFromServer = client.getInputStream( );
//			DataInputStream in = new DataInputStream(inFromServer);
//			System.out.println(“Server says” + in.readUTF( ));
//			client.close( );
//		}
//		catch(IOException e)
//		{
//			e.printStackTrace( );
//		}
//	}
//}
//
//
//
//import java.net.*;
//import java.io.*;
//public class GreetingServer extends Thread
//{
//	private ServerSocket serverSocket;
//	public GreetingServer(int port) throws IOException
//	{
//		serverSocket = new ServerSocket(port);
//		serverSocket.setSoTimeout(1000000);
//	}
//	public void run( )
//	{
//		while(true)
//		{
//			try
//			{
//				System.out.println("Waiting for client on port " + serverSocket.getLocalPort( ) + “...”);
//				Socket server = serverSocket.accept( );
//				System.out.println("Just connected to " + server.getRemoteSocketAddress( ));
//				DataInputStream in =  new DataInputStream(server.getInputStream( ));
//				System.out.println(in.readUTF( ));
//				DataOutputStream out = new DataOutputStream(server.getOutputStream( ));
//				out.writeUTF(“Thank you for connecting to ”+ server.getLocalSocketAddress( )  + “\nGoodbye!”);
//				server.close( );
//			}
//			catch(SocketTimeoutException s)
//			{
//				System.out.println("Socket timed out!");
//				break;
//			}
//			catch(IOException e)
//			{
//				e.printStackTrace( );
//				break;
//			}
//		}
//	}
//	public static void main(String [ ] args)
//	{
//		int port = Integer.parseInt(args[0]);
//		try
//		{
//			Thread t = new GreetingServer(port);
//			t.start( );
//		}
//		catch(IOException e)
//		{
//			e.printStackTrace( );
//		}
//	}
// }