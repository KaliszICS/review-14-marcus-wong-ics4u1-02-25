public class PracticeProblem {

	final static int MAXIMUM = 10;

	public static void main(String args[]) {

	}
	public static int calculate(int num, int num2, char c) {
		switch (c) {
			case '+':
				return num + num2;
				
			case '-':
				return num - num2;
				
			case '*':
				return num * num2;
				
			case '/':
				return num / num2;
				
			case '%':
				return num % num2;
				
			case '^':
				return (int)Math.pow(num, num2);
			
			default:
				return -1;


		}


	}
	public static boolean totalWordsChecker(String word) {

	}

}
