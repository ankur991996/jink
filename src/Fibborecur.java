
public class Fibborecur {
	static int fibbo(int poss){
		if((poss==1) || (poss==2)){
			return 1;
		}else{
			return fibbo(poss-1) + fibbo(poss-2);
		}
	}
	public static void main(String[] args) {
		int val=0;
		for(int i=1;i<=10;i++){
			val=fibbo(i);
			System.out.println(val);
		}
	}

}
