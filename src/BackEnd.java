import java.util.ArrayList;





public class BackEnd 
{
	ArrayList<Messages> mes;
	public BackEnd()
	{
	mes = new ArrayList<Messages>();
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
		if(this.getUser() == null)//if user name doesn't exist
			mes.add(new Messages(us,messs)); //add username and message
		else
			for(int i = 0; i<mes.size();i++) //otherwise find the username
				if(mes.get(i).getUser().equals(us))
				{
					mes.get(i).getMessages().add(mess); //and add a new message
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
