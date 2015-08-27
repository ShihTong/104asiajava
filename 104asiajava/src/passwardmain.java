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

	private Container cp;
	private JFormattedTextField number = new JFormattedTextField();
	private int A = 0, B = 0;
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
					if (number.getText().length() < 4
							&& keyChar >= KeyEvent.VK_0
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
				if (number.getText().length() == 4) {
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
								answer.append("請物輸入相同的數字，請再試一次!\n");
								tt = true;
								break;
							}
						}
						if (tt)
							break;
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

					number.setText("");
				}
			}
		});

		answer.addKeyListener(new KeyAdapter() {
			public void keyTyped(KeyEvent b) {
				b.consume();
			}
		});
	}

	public static void popFrame(String message) {

		int n = JOptionPane.showConfirmDialog(null,
				"你贏啦!可以吃東西了!\n不知道吃什麼,按是決定吧!", "恭喜!!!",
				JOptionPane.YES_NO_OPTION);
		if (n == JOptionPane.YES_OPTION) {
			String resturant[] = { 
					"霧峰老牌羊肉吧!\n在霧峰區樹仁路25號",
					"土耳其美食吧!\n在台中市霧峰區柳豐六街30號", 
					"弘爺早餐店吧!\n在台中市霧峰區柳豐路428號",
					"Pizza Factory 披薩工廠吧!\n在台中市霧峰區樹仁五街12號",
					"老先覺麻辣窯燒火鍋吧!\n在台中市霧峰區樹仁路45號", 
					"三顧茅廬麻辣滷味吧!\n在台中市霧峰區樹仁路71號",
					"NU PASTA杯杯麵吧!\n在台中市霧峰區樹仁路107號",
					"O2 Brunch 歐圖早午餐廚房吧!\n在台中市霧峰區樹仁五街6號",
					"韓國食堂吧!\n在台中市霧峰區林森路998號", 
					"四海遊龍鍋貼專賣店吧!\n在台中市霧峰區中正路841號",
					"台北江麻辣臭豆腐專賣舖吧!\n在台中市霧峰區樹仁路56-5號",
					"大慶麵店吧!\n在台中市霧峰區樹仁路46號",
					"振卿肉羹大王吧!\n在台中市霧峰區林森路762號",
					"祥鶴日本料理吧!\n在台中市霧峰區樹仁路39號",
					"口福牛肉麵吧!\n在台中市霧峰區樹仁路12號", 
					"狸之屋日式食堂吧!\n在台中市霧峰區柳豐路492號",
					"廣鎮茶藝館吧!\n在台中市霧峰區林森路998號",
					"悟饕池上飯包吧!\n在台中市霧峰區中正路1101-2號",
					"Circus簡餐店吧!\n在台中市霧峰區柳豐六街36號",
					"拉亞漢堡吧!\n在台中市霧峰區柳豐二街47號",
					"舞丼吧!\n在台中市霧峰區柳豐路478號",
					"虎匠拉麵吧!\n在台中市霧峰區柳豐六街26號",
					"李記涼麵吧!\n在台中市霧峰區柳豐六街18號",
					"禾家簡餐吧!\n在台中市霧峰區柳豐六街9號",
					"品軫嗶嗶飯吧!\n在台中市台中市霧峰區柳豐路458號", 
					"讚不絕口吧!\n在台中市霧峰區柳豐路480號" 
					};
			int a = (int) (Math.random() * resturant.length);
			Object[] options = { "開動了!" };
			JOptionPane.showOptionDialog(null, "現在去吃" + resturant[a], "吃飯了!",
					JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE,
					null, options, options[0]);
			System.exit(0);
		} else {
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
		// for (int n : num) {
		// System.out.print(n + "");
		// }
		return num;
	}
}