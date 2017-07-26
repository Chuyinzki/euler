import java.util.ArrayList;

public class Solution50 {

    public static void main(String[] args) throws Exception {
        int[] sievedArray = Solution10.sieve(1000000);
        ArrayList<Integer> sievedList = new ArrayList<>();
        for(int num : sievedArray)
            if(num != 0)
                sievedList.add(num);
        ArrayList<Integer> longestSumTerms = new ArrayList<>();
        int sumOfLongest = 0;
        long currentTotalSum = 0;
        for(int i = 0; i < sievedList.size(); i++)
            currentTotalSum += sievedList.get(i);
        for(int i = 0; i < sievedList.size() - longestSumTerms.size(); i++) {

        }
        System.out.println();
    }
}
