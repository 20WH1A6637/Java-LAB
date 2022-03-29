package basic;

public class Power {
	public static void main(String[] args) {
		int n = 2;
		int p = 9;
		int pow = 1;
		for(int i = 1; i < p + 1; i++) {
			pow = pow * n;
		}
		System.out.println(n + " to the power of " + p + " is: " + pow);
	}
}
