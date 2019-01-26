public class EuclidsAlgorithmTest {
	public static void main(String[] args) {
		//Should be 25
		System.out.println(solveGCD(100,25));
		
		//Should be 4
		System.out.println(solveGCD(20,8));
		
		//Should be 8
		System.out.println(solveGCD(64,24));
	}
	
	private static int solveGCD(int a, int b) {
		int greatestCommonDenominator = a;
		int temp = 0;
		
		while (b != 0) {
			temp = greatestCommonDenominator;
			greatestCommonDenominator = b;
			b = temp % b;
		}
		return greatestCommonDenominator;
	}
}
