import java.io.File;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
import java.util.regex.Pattern;

public class Solution22 {

    public static void main(String[] args) throws Exception {
        Scanner scan = new Scanner(new File("../euler/src/resources/p022_names.txt"));
        scan.useDelimiter(Pattern.compile(","));

        ArrayList<String> names = new ArrayList<>();
        while (scan.hasNext())
            names.add(scan.next());

        Collections.sort(names);

        long finalTotal = 0;
        for(int i = 0; i < names.size(); i++) {
            String name = names.get(i);
            int localCount = 0;
            for(int j = 1; j < name.length() - 1; j++)
                localCount += (int)name.charAt(j) - 64;
            finalTotal += localCount * (i + 1);
        }
        System.out.println("Final answer is: " + finalTotal);
    }
}
