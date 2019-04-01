import java.util.Scanner;

public class VowelCount {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a String");
		String st = sc.nextLine();
		int n[] = count(st);
		System.out.println("Count of Vowel =" + n[0]);
		System.out.println("Count of Con =" + n[1]);
		sc.close();
	}

	private static int[] count(String st) {
		int n[] = new int[2];
		int vcount = 0, cCount = 0;
		for (int i = 0; i < st.length(); i++) {
			char ch = st.charAt(i);
			if (ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U' || ch == 'a' || ch == 'e' || ch == 'i'
					|| ch == 'o' || ch == 'u')
				vcount++;
			else
				cCount++;

		}
		n[0] = vcount;
		n[1] = cCount;
		return n;
	}

}
