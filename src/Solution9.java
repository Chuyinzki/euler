
public class Solution9 {

    public static void main(String[] args) {
        final int total = 1000;
        for(int a = 0; a < total - 2; a++) {
            for(int b = a + 1; b < total - 1; b++){
                for(int c = b + 1; c < total; c++) {
                    if(a + b + c != 1000) continue;
                    if(Math.pow(a, 2) + Math.pow(b,2) == Math.pow(c, 2)) {
                        System.out.println(String.format("a = %d\nb = %d\nc = %d", a, b, c));
                        System.out.println("Answer is the product, so a*b*c = " + a*b*c);
                        return;
                    }
                }
            }
        }
    }
}
