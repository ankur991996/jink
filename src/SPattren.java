import java.util.Scanner;

public class SPattren {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter a number");
		int n = sc.nextInt();
		sc.close();
		int ele = 1;
		int k = n / 2;
		for (int i = 0; i < n; i++) {

			for (int j = 0; j < ele; j++) {
				if (j % 2 == 1) {
					System.out.print("* ");
				} else {
					System.out.print(k + " ");
				}
			}
			if (i < 7 / 2) {
				ele = ele + 2;
				k++;
			} else {
				ele = ele - 2;
				k--;
			}
			System.out.println();
		}
	}
}
