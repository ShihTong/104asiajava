import java.util.Scanner;
public class longa {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner scn=new Scanner(System.in);
int a =0;
int kg=0;
while(kg<600){
	System.out.println("輸入公斤數");
	int b=scn.nextInt();
	kg=kg+b;
	a++;	
}
System.out.println("採收了"+a+"棵");
	}

}
