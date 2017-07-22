
public class Solution6 {

    public static void main(String[] args) {
        int sumSquares = 0;
        int squareSums = 0;

        for (int i = 1; i <= 100; i++) {
            sumSquares += i * i;
        }

        for (int i = 1; i <= 100; i++) {
            squareSums += i;
        }
        squareSums *= squareSums;

        System.out.println("The answer is: " + (squareSums - sumSquares));
    }

}
