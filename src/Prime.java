import java.util.Scanner;
public class Prime {

    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        int num,count=0;
        System.out.println("Enter the number to check Prime or not");
        num = sc.nextInt();
        sc.close();
        for(int i=2;i<num;i++){
            if(num%i==0){
                count++;
                break;
            }
        }if(count>1){
            System.out.println("Number is not prime");
        }else{
            System.out.println("Number is prime");
        }
    }



}
