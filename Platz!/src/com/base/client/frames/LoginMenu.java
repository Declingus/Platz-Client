package com.base.client.frames;

import java.awt.event.ActionEvent;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JPasswordField;
import javax.swing.JButton;

public class LoginMenu extends PlatzFrame {


	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField usernameField;
	private JPasswordField passwordField;
	
	private static final int WIDTH= 400;
	private static final int HEIGHT = 300;


	public LoginMenu() {
		super();
		
		setBounds((dim.width/2) - WIDTH/2, (dim.height/2) - HEIGHT/2, WIDTH, HEIGHT);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		usernameField = new JTextField();
		usernameField.setBounds(162, 59, 127, 20);
		contentPane.add(usernameField);
		usernameField.setColumns(10);
		
		passwordField = new JPasswordField();
		passwordField.setBounds(162, 102, 127, 20);
		contentPane.add(passwordField);
		
		JLabel lblPassword = new JLabel("Password:");
		lblPassword.setBounds(76, 105, 76, 14);
		contentPane.add(lblPassword);
		
		JLabel lblUsername = new JLabel("Username:");
		lblUsername.setBounds(76, 62, 76, 14);
		contentPane.add(lblUsername);
		
		JButton btnSignIn = new JButton("Sign In");
		btnSignIn.setBounds(162, 149, 89, 23);
		contentPane.add(btnSignIn);
		
		btnSignIn.addActionListener(this);
		usernameField.addActionListener(this);
	}
	
	@Override
	public void actionPerformed(ActionEvent arg0) 
	{
		
		if(arg0.getActionCommand().equalsIgnoreCase("Sign In"))
			System.out.println("Signing in...");
		if(arg0.getActionCommand().equalsIgnoreCase("username"))
			System.out.println("username");
		
	}
	
}
