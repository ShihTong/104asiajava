import java.util.Scanner;
public class BMI {
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner bmi = new Scanner(System.in);
		System.out.println("請輸入身性別:");
		String str = bmi.next();
		System.out.println("請輸入身高:");
		double a= bmi.nextFloat();
		if(str.equals("男")){				
			double b = (a-170)*0.6+62;
			System.out.println("你的理想體重是:"+b);			
}else{
	if(str.equals("女")){				
		double b = (a-158)*0.5+52;
		System.out.println("你的理想體重是:"+b);
}else{
	System.out.println("請不要亂輸入!!!");
	
}
	}
}
}