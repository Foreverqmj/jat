import java.math.BigInteger;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        BigInteger x = BigInteger.ONE;

        for(int i = 2; i <= n; i++){
            x = x.multiply(BigInteger.valueOf(i));
        }

        System.out.println(x);
    }
}
