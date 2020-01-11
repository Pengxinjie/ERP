package 封装;

public class Test {
	public static void main(String[] args)
	{
		Person a=new Person();
		a.setAge("34");
		String str=a.getAge();
		System.out.print(str);
		//a的年龄已经封装，外界无法直接处理
	}
}
