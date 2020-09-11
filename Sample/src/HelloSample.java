import java.util.Scanner;

public class HelloSample {
	public static void main(String ar[]) {
		System.out.println("enter two numbers");
		
		Scanner s=new Scanner(System.in); 
		int a=s.nextInt();
		int b=s.nextInt();
		
		int c=a+b;
		
		System.out.println("sum is "+c);
		
	}
	

}
