import java.util.Scanner;

public class Hcf {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter how many element you have");
		int n = sc.nextInt();
		int ar[] = new int[n];
		System.out.println("Enter" + n + "integer");
		for (int i = 0; i < n; i++) {
			ar[i] = sc.nextInt();
		}
		int hcf = ar[0];
		for (int i = 0; i < ar.length; i++) {
			hcf = gcd(hcf, ar[i]);
		}
		System.out.println("HCF is =" + hcf);
		sc.close();
	}

	private static int gcd(int a, int b) {
		int temp;
		while (b > 0) {
			temp = b;
			b = a % b;
			a = temp;
		}
		return a;
	}
}
