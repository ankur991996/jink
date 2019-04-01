import java.util.Scanner;

public class palindrom {
	public static void main(String[] args) {
		int n;

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Number to check Palindrom or not");
		n = sc.nextInt();
		int temp = n;
		int rev = 0, rem;
		sc.close();
		while (temp != 0) {
			rem = temp % 10;
			rev = rev * 10 + rem;
			temp = temp / 10;

		}
		if (n == rev) {
			System.out.println(n + " number is Palindrom");
		} else {
			System.out.println(n + " number is not palindrom");
		}

	}

}
