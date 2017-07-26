import java.util.ArrayList;

public class Solution35 {

    public static void main(String[] args) {
        ArrayList<Integer> primes = Solution27.getIntegerPrimes(1000000);
        ArrayList<Integer> circularPrimes = new ArrayList<>();
        for (int prime : primes) {
            if (circularPrimes.contains(prime))
                continue;
            String stringRep = String.valueOf(prime);
            boolean isCircular = true;
            ArrayList<Integer> tempPrimes = new ArrayList<>();
            tempPrimes.add(prime);
            for (int i = 0; i < stringRep.length() - 1; i++) {
                stringRep = stringRep.charAt(stringRep.length() - 1) + stringRep.substring(0, stringRep.length() - 1);
                if (!tempPrimes.contains(Integer.parseInt(stringRep)))
                    tempPrimes.add(Integer.parseInt(stringRep));
                if (!primes.contains(Integer.parseInt(stringRep))) {
                    isCircular = false;
                    break;
                }
            }
            if (isCircular)
                circularPrimes.addAll(tempPrimes);
        }
        System.out.println("The number of circular primes is: " + circularPrimes.size());
        System.out.println("Here is the list of all circular primes: ");
        for (int circPrime : circularPrimes)
            System.out.print(circPrime + " ");
    }
}
