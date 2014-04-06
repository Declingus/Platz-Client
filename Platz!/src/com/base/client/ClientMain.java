package com.base.client;

import com.base.client.frames.LoginMenu;
import com.base.client.frames.MainMenu;
import com.base.client.frames.PlatzFrame;
import com.base.client.net.TCPClient;

public class ClientMain 
{
	public static PlatzFrame[] platzFrames;
	private static final int NUM_FRAMES=2;
	public static final int LOGIN=0, MAIN_MENU=1;
	
	public static TCPClient client;
	
	public static void main(String[] args) 
	{
		initFrames();
		client = new TCPClient();
		
		client.sendData("CLIENT: Hello\n");
		
	}
	
	private static void initFrames()
	{
		platzFrames = new PlatzFrame[NUM_FRAMES];
		
		platzFrames[LOGIN] = new LoginMenu();
		platzFrames[LOGIN].setVisible(true);
		platzFrames[MAIN_MENU] = new MainMenu();
		
	}
	
}
