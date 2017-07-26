import java.util.ArrayList;

public class Solution50 {

    public static void main(String[] args) throws Exception {
        int upTo = 1000000;
        int[] sievedArray = Solution10.sieve(upTo);
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
            long smallingSum = currentTotalSum;
            for(int j = sievedList.size() - 1; j - i >= longestSumTerms.size(); j--) {
                if(smallingSum <= upTo && sievedList.contains((int)smallingSum)) {
                    sumOfLongest = (int)smallingSum;
                    longestSumTerms.clear();
                    for(int k = i; k <= j; k++) {
                        longestSumTerms.add(sievedList.get(k));
                    }
                    break;
                }
                smallingSum -= sievedList.get(j);
            }
            currentTotalSum -= sievedList.get(i);
        }
        System.out.println(String.format("Sum of the longest up to \"%d\" is \"%d\"", upTo, sumOfLongest));
        System.out.println(String.format("With %d terms which are: ", longestSumTerms.size()));
        for(int in : longestSumTerms)
            System.out.print(in + " ");
    }
}
