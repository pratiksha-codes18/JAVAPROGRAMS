package Assignment4;
import javax.swing.*;

public class SampleTest extends JFrame{
	JFrame f;
	SampleTest()
	{
		JButton b = new JButton("Submit");
		
		
		b.setBounds(130,100,100,40);
		add(b);
		setSize(400,500);
		setLayout(null);
		setVisible(true);
	}

	

	public static void main(String[] args) {
	new SampleTest();

	}

}
