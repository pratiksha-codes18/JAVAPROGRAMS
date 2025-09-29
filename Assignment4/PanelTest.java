package Assignment4;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
public class PanelTest extends JFrame{
	private JButton b,b1,b2,b3,b4;
	private JLabel l;
	public PanelTest() {
		l=new JLabel("");
		b=new JButton("button1");
		b1=new JButton("button2");
		b2=new JButton("button3");
		b3=new JButton("button4");
		b4=new JButton("button5");
		
		
		JPanel p=new JPanel();
		p.add(b);
		p.add(b1);
		p.add(b2);
		p.add(b3);
		p.add(b4);
		
		
		p.add(l);
		p.setBackground(Color.white);
		
		add(p);
		
		setSize(300,300);
		
		show();
	}
	

	public static void main(String[] args) {
		PanelTest p=new PanelTest();
	}

}
