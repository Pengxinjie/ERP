package 常用类库;

public class StringBufferTest {
	public static void main(String[] args) {
		StringBuffer a=new StringBuffer("He");
		a.append("llo");
		
		StringBuffer b=a;
		
		a.append("orld");
		
		a.insert(5, "w");//第五个位置后插入值
		
		System.out.print(a);
		
		String x=a.toString();//类型转换
		
		//StringBuffer 线程安全，效率低些                                   “排队轮流操作”
		//StringBuilder 线程不安全，效率高些                            “可能同时操作”
	}
}