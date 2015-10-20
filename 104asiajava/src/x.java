import java.util.Scanner;
 
public class x{
 
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        while (true) {
            String S = input.next();
            if (S.matches("0"))
                break;
            long sum = 0;
            int next = 1;
            for (int i = 0; i < S.length(); i++) {
                if (i % 2 != 0)
                    sum += Integer.parseInt(S.substring(i, next));
                else if (i % 2 == 0)
                    sum -= Integer.parseInt(S.substring(i, next));
                next++;
            }
            if (sum % 11 == 0)
                System.out.println(S + " is a multiple of 11.");
            else
                System.out.println(S + " is not a multiple of 11.");
        }
    }
}
