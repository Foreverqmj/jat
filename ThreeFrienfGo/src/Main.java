import java.math.*;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        BigDecimal c = new BigDecimal(a);
        BigDecimal d = new BigDecimal(b);
        System.out.print(c.divide(d,20,BigDecimal.ROUND_HALF_UP).stripTrailingZeros().toPlainString());
    }

}