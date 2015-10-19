package 第一學期;
import java.util.Random;
import java.util.Scanner;
public class Ex21 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner scn = new Scanner(System.in);
Random rnd = new Random();
System.out.println("請猜1~5其中一個數字:");
int a = scn.nextInt();
int b = (rnd.nextInt(5)+1);
if(a==b){
	System.out.println("你贏了!!!");
	System.out.println("答案是:"+b);
}else{System.out.println("你輸了!!!");
System.out.println("答案是:"+b);
	
}
	}

}
