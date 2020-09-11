import java.util.Scanner;

public class Sample {
	public static void main(String hel[]) {
		System.out.println("Enter two number");
		Scanner l=new Scanner(System.in);
		int num1=l.nextInt();
		int num2=l.nextInt();
		
		
		Sum s=new Sum();
		
		s.calculateSum(num1, num2);
		s.displaySum();
	}

}
