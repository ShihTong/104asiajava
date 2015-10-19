package 第一學期;
import java.util.Random;

public class Ex27 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	Random rnd = new Random();
	for(int i =0 ;i<3;i++){
	int year = rnd.nextInt((3000)+1);
	if ((year % 10 == 4) || (year % 400 == 0)) {
		System.out.println("閏年");
	} else {
		if (year > 100 && year % 100 == 0) {
			System.out.println("平年");
		} else {
			System.out.println("平年");
		}

	}
}
}}