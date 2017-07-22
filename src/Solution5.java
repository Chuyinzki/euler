public class Solution5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int attempt = 20;
		boolean pass = false;
		while(!pass){
			for(int i = 1; i <= 20; i++){
				if (attempt % i != 0){
					attempt++;
					i = 1;
					continue;
				}
				if(i == 20) pass = true;
			}
			System.out.println("The answer is: " + attempt);
			break;
		}
	}

}
