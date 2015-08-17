public class typhoon {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int m = 1;
		double k = 20000;
		while (k < 1100000) {
			k = k + k * 1.002;
			m++;
			while (k >= 1100000) {
				System.out.print(3 + m + "ÂI");
				break;
			}
		}
	}

}
