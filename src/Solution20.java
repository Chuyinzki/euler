import java.math.BigInteger;

public class Solution20 {

    public static void main(String[] args) {
        BigInteger bigNum = BigInteger.ONE;
        for (int i = 100; i > 1; i--)
            bigNum = bigNum.multiply(new BigInteger("" + i));
        System.out.println("Big number is: " + bigNum);
        int ret = 0;
        String numAsString = bigNum.toString();
        for (int i = 0; i < numAsString.length(); i++)
            ret += Integer.parseInt("" + numAsString.charAt(i));
        System.out.println("Final answer is: " + ret);
    }
}
