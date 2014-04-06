package com.base.client.frames;

import java.awt.Dimension;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

import com.base.client.ClientMain;

public class PlatzFrame extends JFrame implements ActionListener
{
	private static final long serialVersionUID = 1L;
	protected static Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
	
	public PlatzFrame()
	{
		final JFrame frame = this;
		frame.addWindowListener(new java.awt.event.WindowAdapter() {
		    @Override
		    public void windowClosing(java.awt.event.WindowEvent windowEvent) 
		    {
		    	if (JOptionPane.showConfirmDialog(frame, "Are you sure to close this window?", "Really Closing?", JOptionPane.YES_NO_OPTION,
		    			JOptionPane.QUESTION_MESSAGE) == JOptionPane.YES_OPTION)
		    	{
		    		ClientMain.client.closeConnection();
		    		System.exit(0);
		    	}
		    }
		});
	}
	
	@Override
	public void actionPerformed(ActionEvent arg0) {
		System.out.println(arg0);
	}
	
	
	
	public void windowClosing(WindowEvent win)
	{
		System.out.println("closing");
	}

}
