import java.util.Scanner;

public class Birthyear {
	public static void main(String[] args) {
		int year =2018;
		Scanner sc = new Scanner(System.in);
				System.out.println(" Enter your age");
		int age =  sc.nextInt();
		int birthyear= year-age;
		System.out.println("Your Birth year was " + birthyear);
		System.out.println("");
		
		sc.close();
		
		
		
		
	}

}
