
public class PrimeCheck {
	// both methods return 0 if composite, 1 if prime
	
	public int isPrime(int input) {
		for(int i = 2; i < input; i++) {
			if (input % i == 0) {
				return 0;
			}
		}
		return 1;
	}
}
