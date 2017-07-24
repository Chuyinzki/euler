import java.math.BigDecimal;

public class Solution16 {

    public static void main(String[] args) {
        BigDecimal biggy = new BigDecimal(2f).pow(1000);
        String asString = biggy.toString();
        int ret = 0;
        for(int i = 0; i < asString.length(); i++)
            ret += Integer.parseInt("" + asString.charAt(i));
        System.out.print("Final answer is: " + ret);
    }
}
