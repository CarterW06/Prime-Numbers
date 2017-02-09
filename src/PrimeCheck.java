
public class PrimeCheck {
	// both methods return 0 if composite, 1 if prime
	
	public static int isPrime(long input) {
		for(int i = 2; i < input; i++) {
			if (input % i == 0) {
				return 0;
			}
		}
		return 1;
	}
}
