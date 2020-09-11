import java.util.Scanner;
//SUM OF NUMBERS
public class ForSample {
	public static void main(String ar[]) {
		System.out.println("Enter a limit");
		Scanner s=new Scanner(System.in);
		int lim=s.nextInt();
		
		int sum=0;
		for(int i=0;i<lim;i++) {
			sum=sum+i;
		}
		System.out.println("Sum of number till "+lim+" is "+sum);
		
	}
	

}
