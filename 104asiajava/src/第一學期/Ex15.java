package 第一學期;
import java.util.Scanner;
public class Ex15 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner scn = new Scanner(System.in);
     System.out.print("請輸入身高(cm):");
     float h = scn.nextFloat();
     System.out.print("請輸入體重(kg):");
     float w = scn.nextFloat();
     System.out.println(h/2.54+"吋");
     System.out.print(w/0.454+"磅");
	}

}
