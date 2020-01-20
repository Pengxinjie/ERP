package Exception;

public class Hello {
	public void hi() throws RenpinException {
		if(Math.random()<0.5)
			System.out.print("hello world");
		else {
			throw new RenpinException();
		}
	}
}                       