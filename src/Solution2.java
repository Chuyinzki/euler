public class Solution2 {

    public static void main(String[] args) {
        int sum = 2;
        int temp1 = 1;
        int temp2 = 2;
        int temp3 = temp1 + temp2;

        while (temp3 < 4000000) {
            if (temp3 % 2 == 0) sum += temp3;
            temp1 = temp2;
            temp2 = temp3;
            temp3 = temp1 + temp2;
        }
        System.out.println("The answer is: " + sum);

    }

}
