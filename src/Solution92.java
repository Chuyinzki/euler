import java.math.BigInteger;
import java.util.ArrayList;
import java.util.HashMap;

public class Solution92 {

    public static void main(String[] args) throws Exception {
        long upTo = 10000000;
        long helperHits = 0;
        long eightyNineCount = 0;
        HashMap<Long, Long> finalCounts = new HashMap<>();
        HashMap<Long, Long> helper = new HashMap<>();
        for(long i = 1; i < upTo; i++) {
            long running = i;
            while(running != 89 && running != 1) {
                if(helper.containsKey(running)) {
                    running = helper.get(running);
                    helperHits++;
                    break;
                }
                long next = 0;
                String rep = String.valueOf(running);
                for(int j = 0; j < rep.length(); j++)
                    next += Math.pow(Double.parseDouble("" + rep.charAt(j)), 2f);
                running = next;
            }
            helper.put(i, running);
            finalCounts.put(running, 1 + (finalCounts.get(running) == null ? 0 : finalCounts.get(running)));
            if(running == 89)
                eightyNineCount++;
        }
        System.out.println("Times the helper got used: " + helperHits);
        System.out.println("The total number that repeated on 89 are: " + eightyNineCount);
        System.out.println("But as a fun fact, these we're the final results for everything:");

        for(long key: finalCounts.keySet())
            System.out.println(String.format("\"%.0f\" showed up \"%.0f\"", (float)key, (float)finalCounts.get(key)));

    }
}
