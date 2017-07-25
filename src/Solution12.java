import java.util.ArrayList;

public class Solution12 {

    public static void main(String[] args) {
        int i = 1;
        long curCount = 0;
        while (true) {
            curCount += i++;
            ArrayList<Long> ret = getFactors(curCount);
            if (ret.size() > 500) {
                System.out.println("First number with over 500 divisors is: " + curCount);
                return;
            }
        }
    }

    private static ArrayList<Long> getFactors(long num) {
        ArrayList<Long> retList = new ArrayList<>();
        Long end = Long.MAX_VALUE;
        for (int i = 1; i < end; i++)
            if (num % i == 0) {
                retList.add((long) i);
                end = num / i;
                retList.add(end);
            }
        return retList;
    }
}
