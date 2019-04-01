
public class BubbleShort {
	public static void main(String[] args) {
		int[] arr = new int[] { 35, 2, 14, 5, 98 };
		System.out.println("Array before Shorting");
		for (int i = 0; i < arr.length; i++) {

			System.out.print(arr[i] + " ");
		}

		bubblesort(arr);
		System.out.println();
		System.out.println("Array after Shorting");
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
	}

	static void bubblesort(int[] myarr) {
		int temp = 0;

		for (int i = 0; i < myarr.length; i++) {
			for (int j = 1; j < myarr.length - i; j++) {
				if (myarr[j - 1] > myarr[j]) {
					temp = myarr[j - 1];
					myarr[j - 1] = myarr[j];
					myarr[j] = temp;

				}
			}
		}

	}
}
