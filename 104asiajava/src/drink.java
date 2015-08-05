import java.util.Scanner;
public class drink {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner drink = new Scanner(System.in);
		System.out.println("請輸入品牌．");
		String str = drink.next();
		System.out.println("請輸入品名．");
		String st = drink.next();
		System.out.println("請輸入價格");
		int a = drink.nextInt();
		if(str.equals("五十嵐")||a>45){
			System.out.println("不會買");
			
	}else{
		if(st.equals("綠茶")||st.equals("咖啡")&&a<=45){
			System.out.println("會買");
		}
		
	}

}
}