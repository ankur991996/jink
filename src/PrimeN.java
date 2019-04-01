import java.util.Scanner;

public class PrimeN {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number");
		int i;
		int n = sc.nextInt();
		sc.close();
		for (i = 2; i <= n-1; i++)
			if (n % i == 0)
				break;
		
		if (i == n) {
			System.out.println("Number is a prime number");
		} else {
			System.out.println("Number is not prime");
		}

	}
}
