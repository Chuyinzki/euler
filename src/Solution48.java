import java.math.BigDecimal;

public class Solution48 {

    public static void main(String[] args) throws Exception {
        long last10 = 0;
        for(int i = 1000; i > 0; i--) {
            System.out.println("Iterating on " + i);
            BigDecimal biggy = BigDecimal.valueOf(i).pow(i);
            last10 = (last10 + biggy.remainder(BigDecimal.valueOf(10000000000L)).longValue()) % 10000000000L;
        }

        System.out.println("Final answer is: " + last10);
    }
}
