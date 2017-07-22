
public class Solution4 {

	public static boolean isPalindrome(int attempt){
		char[] charArray = Integer.toString(attempt).toCharArray();
		int begin = 0;
		int end = charArray.length - 1;
		
		while(end > begin){
			if(charArray[begin] != charArray[end]) return false;	
			begin++;
			end--;
		}
		return true;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int savedFirstNum = 0;
		int savedSecondNum = 0;
		int largestPalindrome = 0;
		
		for(int i = 0; i < 1000; i++){
			for(int j = 0; j < 1000; j++){
				if((i*j) > largestPalindrome && isPalindrome(i*j)){
					savedFirstNum = j;
					savedSecondNum = i;
					largestPalindrome = i*j;
				}
			}
		}
		System.out.println("Answer is: " + largestPalindrome + " made up of " + 
							savedFirstNum + " times " + savedSecondNum);
	}

}
