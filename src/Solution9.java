
public class Solution9 {

    public static void main(String[] args) {
        final int total = 1000;
        for (int a = 0; a < total - 2; a++) {
            for (int b = a + 1; b < total - 1; b++) {
                int c = total - a - b;
                if (b < c && Math.pow(a, 2) + Math.pow(b, 2) == Math.pow(c, 2)) {
                    System.out.println(String.format("a = %d\nb = %d\nc = %d", a, b, c));
                    System.out.println("Answer is the product, so a*b*c = " + a * b * c);
                    return;
                }
            }
        }
    }
}
