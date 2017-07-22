public class Solution3 {

	public static void main(String[] args) {
		// A VERY shitty prime finder
		
		Long largestFactor = 1L;
		Long numToFactor = 600851475143L;
		//Long numToFactor = 21L;
		
		Long i = 2L;
		while(i <= numToFactor){
			if (i == numToFactor){
				largestFactor = numToFactor;
				break;
			}
			if(numToFactor%i == 0){
				System.out.print("Factor found: " + i);
				if(i > largestFactor) largestFactor = i;
				numToFactor = numToFactor/i;
				System.out.println(" New number is: " + numToFactor);
				i = 2L;
			}
			else
				i++;
		}
		System.out.println("The answer is: " + largestFactor);
	}

}
