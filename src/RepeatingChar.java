public class RepeatingChar {
	public static void main(String[] args) {
		String s="I am fIne";
		char r=s.charAt(0);
		int count=0;
		for(int i=0;i<s.length()-1;i++)
		{
			if(r==s.charAt(i))
				count++;
		}
		System.out.println(count);
	}
}
