import java.util.Scanner;
//CHECK WHETHER NUMBER IS POSITIVE OR NEGATIVE
public class IfSample {
	public static void main(String ar[]) {
		System.out.println("enter A number");
		
		Scanner sc=new Scanner(System.in);
		
		int Num=sc.nextInt();
		
		if(Num<0) {
			System.out.println("Number is negative");
		}else {
			System.out.println("Number is positeve");
		}
	}

}
