import java.util.ArrayList;

public class Solution31 {

    public static void main(String[] args) {
        int[] coins = {1, 2, 5, 10, 20, 50, 100, 200};
        long totalPermutations = getPermutations(coins);
        System.out.println("Final way to make the highest coin is: " + totalPermutations);
    }

    private static long getPermutations(int[] coins) {
        long total = 0;
        for(int i = 0; i < coins.length; i++) {
            total += getPermutationsHelper(coins, i, 0, new ArrayList<>());
        }
        return total;
    }

    private static long getPermutationsHelper(int[] coins, int startingIndex, int runningTotal, ArrayList<Integer> curCoins) {
        long count = 0;
        runningTotal += coins[startingIndex];
        curCoins.add(coins[startingIndex]);

        if (runningTotal == coins[coins.length - 1]) {
            System.out.print("Found a match with coins: ");
            for (int i : curCoins)
                System.out.print(i + " ");
            System.out.println();
            return 1;
        }
        if (runningTotal > coins[coins.length - 1]) {
            return 0;
        }

        for (int i = startingIndex; i < coins.length; i++) {
            count += getPermutationsHelper(coins, i, runningTotal, curCoins);
            curCoins.remove(curCoins.size() - 1);
        }
        return count;
    }
}
