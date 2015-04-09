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
	public String toString()
	{
		String s;
		s = this.getUser() + ": ";
		for(int i = 0;i<this.getMessages().size();i++)
			s= s + this.getMessages().get(i) +"\n";
		return s;
	}


}
