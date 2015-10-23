package 第一學期;
import java.util.*;
public class Ex31 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner scn = new Scanner(System.in);
int x = scn.nextInt();
int y;
if(x<-1){
	y=3*(x*x);
	System.out.println(y);
}if(x>=-1&&x<=1){
	y=x*x*x+3*x-3;
	System.out.println(y);
}if(x>1){
	y=x*2+3;
	System.out.println(y);
}

	}

}
