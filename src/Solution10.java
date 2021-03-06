
public class Solution10 {

    public static void main(String[] args) {
        //Sieve
        int upTo = 2000000;
        int[] nums = sieve(upTo);
        long summation = 0;

        for(int num : nums)
            summation += num;

        System.out.println("The summation is: " + summation);
    }

    public static int[] sieve(int upTo) {
        int[] nums = new int[upTo - 1];
        for(int i = 0; i < nums.length; i++)
            nums[i] = i + 2;
        for(int i = 0; i < nums.length; i++) {
            int temp = nums[i];
            if(temp != 0) {
                for(int j = temp * 2 - 2; j < nums.length; j += temp)
                    nums[j] = 0;
            }
        }
        return nums;
    }
}
