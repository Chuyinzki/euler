import java.util.ArrayList;

public class Solution27 {

    public static void main(String[] args) throws Exception {
        //n^2 + an + b
        //a < 1000 and b <= 1000
        int[] sieve = Solution10.sieve(1000000);
        ArrayList<Integer> primes = new ArrayList<>();
        for (int num : sieve)
            if (num != 0)
                primes.add(num);

        int bestA = 0, bestB = 0, maxConsecutive = 0;

        for (int b : primes) {
            if (b > 1000) break;
            Result positive = solutionHelper(primes, b);
            Result negative = solutionHelper(primes, -b);
            Result best = positive.maxConsecutive > negative.maxConsecutive ? positive : negative;
            if(best.maxConsecutive > maxConsecutive) {
                maxConsecutive = best.maxConsecutive;
                bestA = best.bestA;
                bestB = best.bestB;
            }
        }

        System.out.println(String.format("The longest found was length \"%d\" for a = %d and b = %d with product %d",
                maxConsecutive, bestA, bestB, bestA * bestB));
    }

    private static Result solutionHelper(ArrayList<Integer> primes, int b) {
        int maxConsecutive = 0, bestA = 0, bestB = 0;

        for (int a = -1000; a < 1000; a++) {
            int i = 0;
            int localConsecutive = 0;
            while (true) {
                long result = (long) Math.pow(i, 2) + a * i + b;
                if (result > primes.get(primes.size() - 1)) {
                    System.out.println("ERROR: The result was larger than our pre-computated primes! WE NEED MORE!");
                    System.exit(-1);
                }
                if (!primes.contains((int) result))
                    break;
                localConsecutive++;
                if (localConsecutive > maxConsecutive) {
                    maxConsecutive = localConsecutive;
                    bestA = a;
                    bestB = b;
                }
                i++;
            }
        }
        return new Result(bestA, bestB, maxConsecutive);
    }

    private static class Result {
        Result(int bestA, int bestB, int maxConsecutive) {
            this.bestA = bestA;
            this.bestB = bestB;
            this.maxConsecutive = maxConsecutive;
        }

        int bestA;
        int bestB;
        int maxConsecutive;
    }
}
