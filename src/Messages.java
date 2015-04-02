import java.util.ArrayList;


public class Messages 
{
	ArrayList<String> mess;
	String us;
	public Messages(String username, ArrayList<String> Messages)
	{
		us = username;
		mess = Messages;
		
	}
	public String getUser()
	{
		return us;
	}
	public ArrayList<String> getMessages()
	{
		return mess;
	}

}
