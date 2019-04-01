import java.util.Scanner;

public class FibonacciSeries {
	public static void main(String[] args) {
		int a=0,b=1;
		int c;
		int n;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the term for print the series");
		 n = sc.nextInt();
		 sc.close();
		
		
		System.out.println(a+ " " +b);
		for(int i =0;i<=n;i++){
			c=a+b;
			System.out.println(c);
			a=b;
			b=c;
			
		}
	}

}
