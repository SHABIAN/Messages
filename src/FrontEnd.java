		/*
		 * IDK HOW TO DO THE FUCKING SCROLL PANE!
		 * 
		 */

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
//import java.util.ArrayList;

import java.io.FileNotFoundException;
import java.io.UnsupportedEncodingException;

import javax.swing.Box;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class FrontEnd {
	
	private JFrame myFrame;
	private JButton add;
	private JButton get;
	private BackEnd bE = new BackEnd();
	private JScrollPane sP = new JScrollPane();

	public FrontEnd(){
		
		//Window
		myFrame = new JFrame("Message System");
		myFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		myFrame.setLocation(100,250);
		
		//Buttons
		add = new JButton("Add a Message");
		get = new JButton("Get a Message");
		
		//Vertical Box
		Box vB = Box.createVerticalBox();
		
		//Components of Window
		Box username = Box.createHorizontalBox();
		Box message = Box.createHorizontalBox();
		Box buttons = Box.createHorizontalBox();
		Box textArea = Box.createHorizontalBox();
		
		//Text Fields and Text Areas
		JLabel user = new JLabel("Username");
		JTextField userT = new JTextField();
		
		JLabel mess = new JLabel("Message");
		JTextField messT = new JTextField();
		
		JTextArea tA = new JTextArea();
		
		//User name Box
		username.add(user);
		username.add(userT);
		
		//Message Box
		message.add(mess);
		message.add(messT);
		
		//Button Box
		buttons.add(add);
		buttons.add(get);
		
		//Display Box
		textArea.add(tA);
		
		//Putting the Shit together -_-
		vB.add(username);
		vB.add(message);
		vB.add(buttons);
		vB.add(textArea);
		myFrame.add(vB);
		
		//BUTTONSmaru :D
		add.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent arg0) {
				// TODO Auto-generated method stub
				String username = userT.getText();
				String message = messT.getText();
				try {
					bE.addMessage(username, message);
				} catch (FileNotFoundException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				} catch (UnsupportedEncodingException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}});
		
		get.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent arg0) {
				// TODO Auto-generated method stub
				String username = userT.getText();
				bE.getMessage(username);
			}});
		
		
		//DONT FORGET**
		myFrame.pack();
		myFrame.setVisible(true);
		
	}
}
