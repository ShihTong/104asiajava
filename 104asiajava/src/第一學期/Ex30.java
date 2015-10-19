package 第一學期;
import java.util.Scanner;
public class Ex30 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner scn = new Scanner(System.in);
int a = 0;
int b = 0;
int c = 0;
for(int i =0 ;i<6;i++){
	int x = scn.nextInt();
	if(x<0){
		a++;
	}
	if(x>0){
		b++;
	}
	if(x==0){
		c++;
	}
}System.out.println("正數:"+a+"個");
System.out.println("負數:"+b+"個");
System.out.println("0:"+c+"個");
	}

}
