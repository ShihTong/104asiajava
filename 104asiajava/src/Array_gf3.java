import java.util.Random;

public class Array_gf3 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Random rnd = new Random();
		int i=0,j=0,n=10;
		int data[] = new int[10];
		boolean flag=false;
		while(i<10){
			data[i]=(rnd.nextInt(99)+1);
			flag=false;
			for(j =0;j<i;j++){
				if(data[i]==data[j]){
					flag=true;
					
				}
			}
			if(flag==false){
				i++;
			}
		}
		
		for(i=0;i<10;i++){
			for(j=i+1;j<10;j++){
				if (data[i] > data[j]) {
					int v1=data[i];
					data[i]=data[j];
					data[j]=v1;
				}
			}
				}
			for(i=0;i<n;i++){
				System.out.println(data[i]);
		}
}
}