public class Solution1 {
	public static void main(String[] args) {
		int iterator = 0;
		int sum = 0;
		
		while(iterator < 1000){
			if(iterator%5 == 0 || iterator%3 == 0) sum += iterator;
			iterator++;
		}
		System.out.println("The answer is: " + sum);
	}

}
