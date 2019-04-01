import java.util.Scanner;

public class ProfitLoss {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Cost Price");
		int cp = sc.nextInt();
		System.out.println("Enter Selling Price");
		int sp = sc.nextInt();
		sc.close();
		if (cp > sp) {
			System.out.println("your loss is");
			int loss = cp - sp;
			System.out.println("Loss is = " + loss);

			int lossPercent = (loss * 100) / cp;
			System.out.println("Loss percent is" + lossPercent + "%");
		}
		if (sp > cp) {
			System.out.println("your gain is");
			int Gain = sp - cp;
			System.out.println("Gain is =" + Gain);

			int Gainpercent = (Gain * 100) / cp;
			System.out.println("Gain percent is " + Gainpercent + "%");
		} else {
			System.out.println("Cost price is equal to Selling price");
		}

	}

}
