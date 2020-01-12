package Java核心技术第三章;
import java.io.Console;
import java.util.*;

public class IO {
	public static void main(String[] args) {
		/*Scanner scan=new Scanner(System.in);
		System.out.print("What is your name?");	
		String name=scan.nextLine();
		System.out.print(name);
		*/
		Console cons=System.console();
		String username=cons.readLine("user name:");
		char []password=cons.readPassword("Password:");
	}
}
