import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
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
	public void write(String plaintext)
	{
		try {
			PrintWriter p = new PrintWriter(plaintext);
			p.print(plaintext);
			p.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
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
