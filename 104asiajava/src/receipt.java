import java.util.Scanner;

public class receipt {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		int a[] = new int[3];
		System.out.println("這裡有賣:");
		System.out.println("惡鬼槌   100.85元");
		System.out.println("雷神斧    108.85元");
		System.out.println("破魔劍     98.25元");
		System.out.println("買多少個惡鬼槌?");
		a[0] = scn.nextInt();
		System.out.println("買多少個雷神斧?");
		a[1] = scn.nextInt();
		System.out.println("買多少個破魔劍?");
		a[2] = scn.nextInt();
		Weapon 惡鬼槌 = new Weapon(100.85, 0);
		Weapon 雷神斧 = new Weapon(108.85, 0);
		Weapon 破魔劍 = new Weapon(98.25, 0);
		System.out.println("	      " + "發票(亞洲資工站)" + "					");
		System.out.println("台中市霧峰區柳豐路500號");
		System.out.println("電話:04-23323456 #6101");
		System.out.println("傳真:04-23323876");
		System.out.println("==================================");
		System.out.println("武器名稱　　　單價　　　　　數量　　　　　小計");
		System.out.println("----------------------------------");
		while (a[0] > 0) {
			System.out.println("惡鬼槌　　　" + 惡鬼槌.getprice() + "	  " + a[0] + "	  " + 惡鬼槌.getprice() * a[0]);
			break;
		}
		while (a[1] > 0) {
			System.out.println("雷神斧　　　" + 雷神斧.getprice() + "	  " + a[1] + "	  " + 雷神斧.getprice() * a[1]);
			break;
		}
		while (a[2] > 0) {
			System.out.println("破魔劍　　　" + 破魔劍.getprice() + "	  " + a[2] + "	  " + 破魔劍.getprice() * a[2]);
			break;
		}
		System.out.println("==================================");
		System.out.println("合計" + (惡鬼槌.getprice() * a[0] + 雷神斧.getprice() * a[1] + 破魔劍.getprice() * a[2]));
		System.out.println("需要查詢商品武器資訊嗎?(輸入YorN)");
		String str = scn.next();
		while (true) {
			if (str.equals("Y")) {
				System.out.println("請輸入武器名稱:");
				String st = scn.next();
				if (st.equals("惡鬼槌")) {
					System.out.println("價格:100.85元");
					System.out.println("攻擊力+1000");
					System.out.println("對惡鬼傷害+20%");
					System.out.println("還需要查詢商品武器資訊嗎?(輸入YorN)");
					String aa = scn.next();
					if (aa.equals("N")) {
						System.out.println("銘謝惠顧!!!");
						break;
					}
				} else {
					if (st.equals("雷神斧")) {
						System.out.println("價格:108.85元");
						System.out.println("攻擊速度+150%");
						System.out.println("每攻擊三次附加自身攻擊力500%的傷害");
						System.out.println("還需要查詢商品武器資訊嗎?(輸入YorN)");
						String bb = scn.next();
						if (bb.equals("N")) {
							System.out.println("銘謝惠顧!!!");
							break;
						}
					} else {
						if (st.equals("破魔劍")) {
							System.out.println("價格:98.25元");
							System.out.println("無視敵人的防禦30%");
							System.out.println("還需要查詢商品武器資訊嗎?(輸入YorN)");
							String cc = scn.next();
							if (cc.equals("N")) {
								System.out.println("銘謝惠顧!!!");
								break;
							}
						}
					}
				}
			} else {
				if (str.equals("N")) {
					System.out.println("銘謝惠顧!!!");
					break;
				}
			}
		}
	}
}

class Weapon {
	private float price;

	public Weapon(double d, int q) {
		price = (float) d;
	}

	public void setprice(double p) {
		price = (float) p;
	}

	public float getprice() {
		return price;

	}
}