import java.util.Scanner;

public class Sum {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter 1st number");
		int a = sc.nextInt();
		System.out.println("Enter 2nd number");
		int b = sc.nextInt();
		int count = 0;
		for (int i = 1; i <= a; i++) {
			if (a > 0)
				count++;
		}
		for (int i = 1; i <= b; i++) {
			if (b > 0)
				count++;
		}
		System.out.println("Sum of the number is = " + count);
		sc.close();

	}

}
