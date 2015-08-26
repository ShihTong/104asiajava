import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.JFormattedTextField;

@SuppressWarnings("serial")
public class passwardmain extends JFrame {

	/**
	 * @param args
	 */

	// TODO Auto-generated method stub
	private JButton jbtnGuess = new JButton("Guess");
	private JTextArea answer = new JTextArea();
	private JScrollPane scroll = new JScrollPane(answer);
	private JLabel jlb1 = new JLabel();
	private JLabel jlb2 = new JLabel();
	private Frame frame;
	private Dialog win = new Dialog(frame, "new");
	private Container cp;
	private JFormattedTextField number = new JFormattedTextField();
	private int A = 0, B = 0, X = 0;
	private int[] data = new int[4];
	private int[] user = new int[4];

	public passwardmain() {
		initComp();
		data = rndNum();
	}

	private void initComp() {
		cp = this.getContentPane();
		this.setBounds(500, 150, 400, 600);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		cp.setLayout(null);
		cp.add(jlb1);
		cp.add(number);
		cp.add(jbtnGuess);
		cp.add(scroll);
		cp.add(jlb2);

		jlb1.setBounds(50, 125, 300, 25);
		jlb1.setText("顯示A為同個位數相同,顯示B為不同位數相同");
		number.setBounds(30, 50, 150, 25);
		jbtnGuess.setBounds(250, 50, 100, 25);
		scroll.setBounds(30, 150, 320, 380);
		number.setToolTipText("請輸入不相同的四個數字!!");

		number.addKeyListener(new KeyAdapter() {
			public void keyTyped(KeyEvent a) {
				int keyChar = a.getKeyChar();

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
			public void actionPerformed(ActionEvent a) {
				int c = Integer.parseInt(number.getText());
					A = 0;
					B = 0;
					boolean tt = false;
					int num = (c);
					user[0] = num / 1000 % 10;
					user[1] = num / 100 % 10;
					user[2] = num / 10 % 10;
					user[3] = num / 1 % 10;
					for (int i = 0; i < 4; i++) {
						for (int j = 0; j < i; j++) {
							if (user[i] == user[j]) {
								answer.append("輸入錯誤，請再試一次!\n");
								tt = true;
								break;
							}
						}
						if (tt) break;
					}
					if (tt == false) {
						for (int i = 0; i < 4; i++) {
							if (user[i] == data[i]) {
								A++;
							}
							for (int j = 0; j < 4; j++) {
								if (data[i] == user[j]) {
									B++;
								}
							}
						}
						B = B - A;
						answer.append(number.getText() + "\t");
						answer.append(A + "A" + B + "B\t");
						if (A == 4) {
							answer.append("你贏啦!可以吃東西了!\n");
							popFrame("你贏啦!可以吃東西了!");
						} else {
							answer.append("尚未答對，請繼續猜!\n");
						}
					}
					X = 4;
					number.setText("");
				
			}
		});

		answer.addKeyListener(new KeyAdapter() {
			public void keyTyped(KeyEvent b) {
				b.consume();

			}
		});
	}
	public static void popFrame(String message){
		
		int n = JOptionPane.showConfirmDialog(null,
				"你贏啦!可以吃東西了!\n不知道吃什麼,按這決定吧!","恭喜!!!", JOptionPane.YES_NO_OPTION);
		if(n == JOptionPane.YES_OPTION){
			String resturant[] = { "嗶嗶飯", "牛肉麵", "禾家", "火鍋", "狸之家", "圈圈",
					"麥當勞", "全家", "7-11", "涼麵", "這一間早餐", "來來", "四海", "必勝客" };
			int a = (int) (Math.random() * resturant.length);
			System.out.println((a + 1) + "." + resturant[a]);
			JOptionPane.showConfirmDialog(null,
					"現在去吃"+resturant[a]+"吧!","吃飯了!", JOptionPane.YES_OPTION);
			System.exit(0);
		}else{
			System.exit(0);
		}
	}
	public static int[] rndNum() {
		int[] num = new int[4];
		for (int i = 0; i < 4; i++) {
			num[i] = (int) (Math.random() * 10);
			for (int j = 0; j < i; j++) {
				if (num[i] == num[j]) {
					i--;
					break;
				}
			}
		}
		for(int n:num){
			System.out.print(n+"");
		}
		return num;
	}
}