import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.Scanner;

public class passwardmain extends JFrame {

	/**
	 * @param args
	 */

	// TODO Auto-generated method stub
	private JButton jbtnGuess = new JButton("Guess");
	private JTextField number = new JTextField();
	private JTextArea answer = new JTextArea();
	private JLabel jlb1 = new JLabel();
	private JLabel jlb2 = new JLabel();
	private Container cp;

	public passwardmain() {
		initComp();
	}

	private void initComp() {
		cp = this.getContentPane();
		this.setBounds(500, 150, 400, 600);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		cp.setLayout(null);
		cp.add(jlb1);
		cp.add(number);
		cp.add(jbtnGuess);
		cp.add(answer);
		cp.add(jlb2);
		jlb1.setBounds(50, 70, 250, 25);
		jlb1.setText("Guess a number");
		jlb2.setBounds(50, 125, 300, 25);
		jlb2.setText("顯示A為同個位數相同,顯示B為不同位數相同");
		number.setBounds(30, 100, 150, 25);
		jbtnGuess.setBounds(250, 100, 100, 25);
		answer.setBounds(30, 150, 320, 380);
		jbtnGuess.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent a) {

			}
		});

	}

}
