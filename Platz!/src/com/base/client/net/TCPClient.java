package com.base.client.net;

import java.io.*;
import java.net.*;

public class TCPClient
{
	private Socket clientSocket;
	private BufferedReader dataIn;
	private DataOutputStream dataOut;
	
	public TCPClient()
	{
		try
		{
			this.clientSocket = new Socket("localhost", 6789);

			clientSocket.setKeepAlive(true);

			dataOut = new DataOutputStream(clientSocket.getOutputStream());
			dataIn = new BufferedReader(new InputStreamReader(clientSocket.getInputStream()));
			
		} 
		catch (IOException e)
		{
			e.printStackTrace();
		}
	}


	public void sendData(String send)
	{
		
		try 
		{
			dataOut.writeBytes(send);
		} 
		catch (IOException e1)
		{
			e1.printStackTrace();
		}
		
	}
	
	public void receiveData()
	{
		String reply=null;
		try 
		{
			
			if(dataIn.ready())
			{
				reply = dataIn.readLine();

				System.out.println(reply);
			}

		} 
		catch (IOException e1)
		{
			e1.printStackTrace();
		}
		
	}
	
	public void closeConnection()
	{
		try
		{
			sendData("close");
			dataIn.close();
			dataOut.close();
			clientSocket.close();
			System.out.print("Connection Closed...");
		} 
		catch (IOException e)
		{
			e.printStackTrace();
		}
	}


}
