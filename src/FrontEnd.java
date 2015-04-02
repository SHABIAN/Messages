import javax.swing.Box;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class FrontEnd {
	
	private JFrame myFrame;
	private JButton add;
	private JButton get;

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
		vB.add(Box.createVerticalStrut(10));
		
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
		
		myFrame.pack();
		myFrame.setVisible(true);
	}
}
