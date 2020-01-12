package Java核心技术第三章;

/**    
 * 字符串方法，及操作测试
 * */

public class Str {
	public static void main(String[] args)
	{
		String greeting ="hello";
		String s=greeting.substring(0,3);
		System.out.println(s);
		//substring 提取子串的方法
		
		String st=s+"PG"+13;
		System.out.println(st);
		//任何一个java对象都能转换成字符串
		/* String 类对象为不可变字符串，可用substring方法提取子串然后进行拼接
		 * 优点：可以让字符串共享
		 * */
		
		String all=String.join("%","abc","def","fef");//第一个参数为分隔符  将后续的字符串分隔开
		System.out.println(all);
		
		/*检测字符串是否相等
		s.equals(t);           该方法区分大小写
		若s与t相等则返回true，反之返回false
		*/
		boolean a;
		a=greeting.substring(0,3).equals("Hel"); 
		System.out.println(a);
		//若不区分大小写，使用equalsIgnoreCase方法
		a=greeting.substring(0,3).equalsIgnoreCase("Hel"); 
		System.out.println(a);
		//不能使用==来判断字符串是否相等！！
		//另外一种比较字符串的方法 compareTo
		int b;
		b=greeting.substring(0,3).compareTo("hel");//相同返回0，区别大小写 
		System.out.println(b);
		
		//length方法返回字符串所需要的代码单元数量
		int c;
		c=greeting.length();
		System.out.println(c);
		
		//得到码点数量，即实际长度 codePoint
		c=greeting.codePointCount(0, greeting.length());
		System.out.println(c);
		
		/*返回位置n的码点单元的方法：charAt(n)*/
		char ch=greeting.charAt(2);
		System.out.println(ch);
		//尽量不使用char类型，太底层了
		
		StringBuilder builder =new StringBuilder();//创建空字符串构建器
		builder.append("af");
		builder.append("ge");
		String ss=builder.toString();
		System.out.print(ss);//转化成字符串
		
	}
}
