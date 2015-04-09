import java.io.File;
//import java.io.FileNotFoundException;
//import java.io.PrintWriter;
import java.util.ArrayList;

import javax.swing.JFileChooser;





public class BackEnd 
{
	ArrayList<Messages> mes;
	Encoder e;
	File f;
	public BackEnd()
	{
	mes = new ArrayList<Messages>();
	
	JFileChooser jc = new JFileChooser("../"); //Jfilechooser to find file to incode too
	jc.showOpenDialog(null);
	f= jc.getSelectedFile();
	e = new Encoder(f);
	}
	public ArrayList<String> getMessage(String us)
	{
		ArrayList<String> mess = new ArrayList<String>(); //new array list
		for(int i = 0;i<mes.size();i++) //search array list for user name
			if(mes.get(i).getUser().equals(us))
			{
				mess = mes.get(i).getMessages();//get messages for the user
				return mess; //return messages
			}
		
		
		return null;
	}
	
	public void addMessage(String us, String mess)
	{
	
		ArrayList<String> messs = new ArrayList<String>();
		messs.add(mess);
		Messages m = new Messages(us,messs);
		if((mes.size()==0))
		{
			mes.add(m); //add username and message
			e.write(m.toString());
			System.out.println("0");
		
		}
		for(int i = 0; i<mes.size();i++) //find username
			{
			if(mes.get(i).getUser().equals(us))
			
				{
					mes.get(i).getMessages().add(mess); //and add a new message
					e.write(m.toString());
					System.out.println("1");
				}
			
			}
			
			
				
	
		
		
		
	}
	
	public ArrayList<String> getUser()
	{
		ArrayList<String> us = new ArrayList<String>();
		for(int i = 0; i<mes.size();i++)//go through all usernames
			us.add(mes.get(i).getUser());
		return us;//output all usernames
		
	}
	public ArrayList<Messages> getList()
	{
		return mes;
	}
}
