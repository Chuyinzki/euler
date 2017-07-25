import java.util.AbstractMap;
import java.util.ArrayList;

public class Solution21 {

    public static void main(String[] args) {
        long retTotal = 0;
        ArrayList<AbstractMap.SimpleImmutableEntry<Long, Long>> list = new ArrayList<>();
        for (long i = 1; i < 10000; i++)
            list.add(new AbstractMap.SimpleImmutableEntry<>(i, properDivisorsSum((int) i)));
        for (int i = 0; i < list.size() - 1; i++)
            for (int j = i + 1; j < list.size(); j++)
                if (list.get(i).getValue().equals(list.get(j).getKey()) && list.get(j).getValue().equals(list.get(i).getKey()))
                    retTotal += list.get(i).getKey() + list.get(j).getKey();
        System.out.println("Final answer is: " + retTotal);
    }

    private static long properDivisorsSum(int num) {
        ArrayList<Long> divisors = Solution12.getFactors(num);
        long ret = 0;
        for (Long n : divisors)
            ret += n;
        return ret - num;
    }
}
