import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.Scanner;

public class Swing2 extends JFrame {

	/**
	 * @param args
	 */
	Scanner scn = new Scanner(System.in);
	private JButton jbtnConvert = new JButton("Convert");
	private JLabel jlb1 = new JLabel();
	private JLabel jlb2 = new JLabel();
	private JLabel jlb3 = new JLabel();
	private JLabel jlb4 = new JLabel();
	private JTextField degree = new JTextField();
	private Container cp;
	private String str = "Celsius";

	public Swing2() {
		initComp();
	}

	private void initComp() {
		// TODO Auto-generated method stub
		cp = this.getContentPane();
		this.setBounds(150, 100, 600, 400);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		cp.setLayout(null);
		jlb1.setBounds(50, 70, 250, 25);
		jlb1.setText(str);
		jlb2.setBounds(200, 70, 250, 75);
		jlb2.setText("=");
		jlb3.setBounds(250, 70, 250, 75);
		jlb4.setBounds(250, 70, 250, 25);
		jlb4.setText("Fahrenheit");
		cp.add(jlb1);
		cp.add(jlb2);
		cp.add(jlb3);
		cp.add(jlb4);
		degree.setLocation(50, 100);
		degree.setSize(100, 20);
		cp.add(degree);
		jbtnConvert.setBounds(50, 200, 200, 25);
		cp.add(jbtnConvert);
		jbtnConvert.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent a) {
				String c = degree.getText();
				float f = fun(c);
				jlb3.setText(f+"");

			}
		});
	}
		public float fun(String n){
			int c =Integer.parseInt(n);
			return (float)(c*9.0/5.0+32);
	
	}
}
