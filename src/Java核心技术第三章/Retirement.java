package Java核心技术第三章;
import java.util.*;
public class Retirement {
	public static void main(String[] args) {
		//read input
		Scanner in=new Scanner(System.in);
		
		System.out.print("How much many do you need to retire?");
		double goal=in.nextDouble();
		
		System.out.print("How much money will you contribute every year?");
		double payment =in.nextDouble();
		
		System.out.print("Interest rate in %");
		double interestRate=in.nextDouble();
		
		double balance =0;
		int year =0;
		
		//update account balance while goal isn't reached 
		while (balance<goal)
		{
			//add this year's payment and interest
			balance+=payment;
			double interest=balance*interestRate/100;
			balance+=interest;
			year++;
		}
		
		System.out.print("You can retire in "+year+" years.");
		
		//升级版的for循环
		
	}
}
