
public class Solution7 {

    public static void main(String[] args) {
        // A slow prime finder
        int primeFound = 0;
        int attempt = 2;
        while (primeFound < 10001) {
            boolean pass = true;
            for (int i = 2; i < attempt; i++) {
                if (attempt % i == 0) {
                    attempt++;
                    i = 2;
                    pass = false;
                    break;
                }
            }
            if (pass) System.out.println("Prime number " + ++primeFound + " is " + attempt++);
        }
        System.out.println("The answer is: " + --attempt);

    }

}
