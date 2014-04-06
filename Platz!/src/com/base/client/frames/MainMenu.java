package com.base.client.frames;

import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;

public class MainMenu extends PlatzFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField textField;

	
	private static final int WIDTH=100;
	private static final int HEIGHT=200;

	public MainMenu() {
		super();
		
		
		setBounds((dim.width/2) - WIDTH/2, (dim.height/2) - HEIGHT/2, WIDTH, HEIGHT);
		
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		textField = new JTextField();
		textField.setBounds(121, 97, 86, 20);
		contentPane.add(textField);
		textField.setColumns(10);
	}

}
