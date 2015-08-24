import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.JFormattedTextField;

public class passwardmain extends JFrame {

	/**
	 * @param args
	 */

	// TODO Auto-generated method stub
	private JButton jbtnGuess = new JButton("Guess");
	private JTextArea answer = new JTextArea();
	private JLabel jlb1 = new JLabel();
	private JLabel jlb2 = new JLabel();
	private Container cp;
	private char a = 'A';
	private char b = 'B';
	private JFormattedTextField number = new JFormattedTextField();

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

		jlb1.setBounds(50, 125, 300, 25);
		jlb1.setText("顯示A為同個位數相同,顯示B為不同位數相同");
		number.setBounds(30, 50, 150, 25);
		jbtnGuess.setBounds(250, 50, 100, 25);
		answer.setBounds(30, 150, 320, 380);
		number.setToolTipText("請輸入1~9999");
		number.addKeyListener(new KeyAdapter() {
			public void keyTyped(KeyEvent a) {
				int keyChar = a.getKeyChar();
				char c = a.getKeyChar();
	
				if (number.getText().length() < 4 && keyChar >= KeyEvent.VK_0
						&& keyChar <= KeyEvent.VK_9) {
				} else {
					if (keyChar == KeyEvent.VK_BACK_SPACE) {
					} else {
						a.consume();
					}
				}
			}

		});

		jbtnGuess.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent b) {
				float c = Float.parseFloat(number.getText());
				number.setText(" ");
			}
		});
		answer.addKeyListener(new KeyAdapter() {
			public void keyTyped(KeyEvent b) {
				b.consume();

			}
		});
		
	}
}
