import java.util.ArrayList;
import java.util.HashSet;

public class Solution23 {

    public static void main(String[] args) throws Exception {
        ArrayList<Integer> abundantNumbers = new ArrayList<>();
        for(int i = 1; i <= 28123; i++) {
            ArrayList<Long> divisors = Solution12.getFactors(i);
            int addition = 0;
            for(long divisor : divisors)
                addition += divisor;
            addition -= i;
            if(addition > i)
                abundantNumbers.add(i);
        }

        HashSet<Long> abundantSums = new HashSet<>();
        for(int i = 0; i < abundantNumbers.size(); i++)
            for(int j = i; j < abundantNumbers.size(); j++)
                    abundantSums.add((long)abundantNumbers.get(i) + abundantNumbers.get(j));

        long finalTotal = 0;
        for(int i = 1; i <= 28123; i++)
            if(!abundantSums.contains((long)i))
                finalTotal += i;
        System.out.println("Final answer is: " + finalTotal);
    }
}
