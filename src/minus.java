import java.util.Scanner;

public class minus {
	public static void main(String[] args) {
		int count = 0, small = 0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter 1st number");
		int a = sc.nextInt();
		System.out.println("Enter 2nd number");
		int b = sc.nextInt();
		if (a > b) {
			count = a;
			small = b;
		} else {
			count = b;
			small = a;
		}
		for (int i = 1; i <= small; i++) {
			count--;
		}
		System.out.println("result is  =" + count);
		sc.close();
	}

}
