import java.util.Scanner;
public class while_year {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner scn = new Scanner(System.in);
for(int i=0;i>=0;i++){
	System.out.println("請輸入西元年");
	int a=scn.nextInt();
	if((a%10==4)||(a%400==0)){
	System.out.println("是閏年");
	break;
	}else{
		if(a>100&&a%100==0){
		System.out.println("不是閏年");		
	}else{
		System.out.println("不是閏年");	
	}
		
}
}
}	}