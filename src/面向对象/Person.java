package 面向对象;
/**
 * 人类（种族，族群，概念）
 * @author asus
 *
 */
public class Person {//        三属性    一方法
	String name;
	int age;
	String sex;
	/*
	 * 构造方法：用来构建对象的方法
	 * 名字与类名相同，不写返回值类型
	 * 构造方法只在new的时候被调用
	 * 不写系统默认无参构造！
	 * 
	 * 当我们编写过有参构造，默认无参就没了
	 * */
	public Person() {
		// TODO Auto-generated constructor stub
	}
	public Person(String mingzi) {
		name=mingzi;
	}
	
	public void say(int a){
		System.out.print("我叫："+name+" 年龄："+age+" 性别："+sex);
	}
	
	public void say(){
		System.out.print("大家好，我叫："+name+" 年龄："+age+" 性别："+sex);
	}
}
