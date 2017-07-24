public class Solution14 {

    public static void main(String[] args) {
        int million = 1000000;
        int numWithLongestChain = 0;
        long longestChain = 0L;
        for (int i = 1; i < million; i++) {
            long currentChain = 1;
            long num = i;
            while (num != 1) {
                if (num % 2 == 0)
                    num = num / 2;
                else
                    num = num * 3 + 1;
                currentChain++;
            }
            numWithLongestChain = currentChain > longestChain ? i : numWithLongestChain;
            longestChain = currentChain > longestChain ? currentChain : longestChain;
        }
        System.out.println("Longest chain is: " + longestChain);
        System.out.println("Which belongs to number: " + numWithLongestChain);
    }
}
