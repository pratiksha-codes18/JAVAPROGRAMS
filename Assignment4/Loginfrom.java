package Assignment4;
import javax.swing.*;

public class Loginfrom {
    public static void main(String[] args) {
        JFrame f = new JFrame("Login");

        JLabel l1 = new JLabel("Username:");
        l1.setBounds(30, 30, 80, 20);
        JTextField t1 = new JTextField();
        t1.setBounds(120, 30, 120, 20);

        JLabel l2 = new JLabel("Password:");
        l2.setBounds(30, 70, 80, 20);
        JPasswordField t2 = new JPasswordField();
        t2.setBounds(120, 70, 120, 20);

        JButton b1 = new JButton("Login");
        b1.setBounds(40, 120, 80, 30);

        JButton b2 = new JButton("Reset");
        b2.setBounds(150, 120, 80, 30);

        f.add(l1); f.add(t1);
        f.add(l2); f.add(t2);
        f.add(b1); f.add(b2);

        f.setSize(300, 220);
        f.setLayout(null);
        f.setVisible(true);
    }
}


	
	
	
	
	

