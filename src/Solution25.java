import java.math.BigInteger;
import java.util.ArrayList;

public class Solution25 {

    public static void main(String[] args) throws Exception {
        ArrayList<BigInteger> biggies = new ArrayList<>();
        biggies.add(BigInteger.ONE);
        biggies.add(BigInteger.ONE);

        int i = 2;
        while(biggies.get(biggies.size() - 1).toString().length() < 1000) {
            biggies.add(biggies.get(i - 1).add(biggies.get(i - 2)));
            i++;
        }
        System.out.println("Final answer is: " + i);
        System.out.println("Where that big ol' number is: " + biggies.get(biggies.size() - 1));
    }
}
