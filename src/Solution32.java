import java.util.HashSet;

public class Solution32 {

    public static void main(String[] args) throws Exception {
        HashSet<Long> products = new HashSet<>();
        for (long a = 1; a < 12345; a++) {
            System.out.println("a is currenty: " + a);
            for (long b = 1; b < 9876; b++) {
                long c = a * b;
                String rep = "" + a + b + c;
                if (rep.length() != 9)
                    continue;
                HashSet<Character> temp = new HashSet<>();
                for (int i = 0; i < rep.length(); i++) {
                    char ch = rep.charAt(i);
                    if (ch == '0' || !temp.add(ch))
                        break;
                }
                if (temp.size() == rep.length())
                    products.add(c);
            }
        }
        System.out.println("Here are the products ");
        long sum = 0;
        for (long i : products) {
            sum += i;
            System.out.print(i + " ");
        }
        System.out.println();
        System.out.println("The final sum is: " + sum);
    }
}
