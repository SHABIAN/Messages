import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.Scanner;


public class Encoder 
{
	File f;
//	ArrayList<Messages> m;
	public Encoder(File File)
	{
		f= File;
	}
	public void write(String plaintext) throws FileNotFoundException, UnsupportedEncodingException
	{
		
			PrintWriter p;

				
					p = new PrintWriter(f);
					p.print(plaintext);
					p.close();
				
			
			
	}
	public ArrayList<Messages> read()
	{
		ArrayList<Messages> m = new ArrayList<Messages>();

		try{
		Scanner fin = new Scanner(f);
		while(fin.hasNextLine()){
			String[] s = fin.nextLine().split("\t");
			String user = s[0];
			ArrayList<String> mes = new ArrayList<String>();
			for (int i= 1; i<s.length;i++)
			{
				mes.add(s[i]);
			}
			m.add(new Messages(user,mes));
			
			fin.close();
			
		}
		} catch(FileNotFoundException e){
			e.printStackTrace();
		}
		return m;
	}
	


}
