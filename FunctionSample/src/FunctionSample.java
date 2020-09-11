import java.util.Scanner;
//SUM OF TWO NUMBER
public class FunctionSample {
	public static void main(String ar[]) {
		System.out.println("Enter two numbers");
		Scanner as=new Scanner(System.in);
		
		int num1=as.nextInt();
		int num2=as.nextInt();
		
		int result=sum(num1,num2);
		System.out.println("Sum is "+result);
		
		
	}
	
	static int sum(int num1,int num2) {
		int res=num1+num2;
		return res;
	}
	

}
