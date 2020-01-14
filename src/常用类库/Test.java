package 常用类库;

import java.lang.*;
//默认
public class Test extends Object {//不写默认
	public static void main(String[] args) {
		Student st =new Student();
		Student st2=new Student();
		
		//判断两个对象是否相等，默认对比两个对象的内存地址
		st.equals(st2);
		
		//把对象转换成字符串，默认转换成对象的内存地址
		String str=st.toString();
		
		//违禁字符
		String s="北京欢迎你！北京欢迎你";
		System.out.print(s.replaceAll("欢", "*"));
		System.out.println(s.replaceFirst("京", "*"));//只替换第一次出现的字符串
		System.out.println(s.endsWith("你"));//判断是否以某个字符串结尾
	}
}