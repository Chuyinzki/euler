import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Solution18 {

    private static final String problem = "75\n" +
            "95 64\n" +
            "17 47 82\n" +
            "18 35 87 10\n" +
            "20 04 82 47 65\n" +
            "19 01 23 75 03 34\n" +
            "88 02 77 73 07 63 67\n" +
            "99 65 04 28 06 16 70 92\n" +
            "41 41 26 56 83 40 80 70 33\n" +
            "41 48 72 33 47 32 37 16 94 29\n" +
            "53 71 44 65 25 43 91 52 97 51 14\n" +
            "70 11 33 28 77 73 17 78 39 68 17 57\n" +
            "91 71 52 38 17 14 91 43 58 50 27 29 48\n" +
            "63 66 04 68 89 53 67 30 73 16 69 87 40 31\n" +
            "04 62 98 27 23 09 70 98 73 93 38 53 60 04 23";

    public static void main(String[] args) {
        solve(problem);
    }

    public static void solve(String problem) {
        ArrayList<ArrayList<Integer>> list = populateLists(problem);
        for(int i = 1; i < list.size(); i++) {
            ArrayList<Integer> curList = list.get(i);
            ArrayList<Integer> upperList = list.get(i - 1);
            for(int j = 0; j < curList.size(); j++) {
                if(j == 0)
                    curList.set(j, upperList.get(0) + curList.get(j));
                else if(j == curList.size() - 1)
                    curList.set(j, upperList.get(curList.size() - 2) + curList.get(j));
                else
                    curList.set(j, Math.max(upperList.get(j - 1), upperList.get(j)) + curList.get(j));
            }
        }
        ArrayList<Integer> solutionList = list.get(list.size() - 1);
        Collections.sort(solutionList);
        System.out.println("Solution for largest is: " + solutionList.get(solutionList.size() - 1));
    }

    public static ArrayList<ArrayList<Integer>> populateLists(String problem) {
        Scanner scan = new Scanner(problem);
        ArrayList<ArrayList<Integer>> retList = new ArrayList<>();
        int rowCount = 1;
        while(scan.hasNext()) {
            ArrayList<Integer> innerList = new ArrayList<>();
            for(int i = 0; i < rowCount; i++)
                innerList.add(scan.nextInt());
            retList.add(innerList);
            rowCount++;
        }
        return retList;
    }
}
