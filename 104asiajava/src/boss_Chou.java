import java.util.Scanner;
public class boss_Chou {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner day = new Scanner(System.in);
		System.out.println("今天星期幾？");
		int a = day.nextInt();
		System.out.println("今天幾號？");
		int b = day.nextInt();
		if((a==2||a==4||a==6)&&(b%10!=7)){
			System.out.println("今天吃素");
		}else{
			System.out.println("今天吃肉");
			
			
		

	}

}
}
