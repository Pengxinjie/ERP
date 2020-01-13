package 面向对象;

public class Test {
	public static void main(String[] args) {
		
		Person Pxj=new Person();//Person自定义类型      声明并创造一个人
		Pxj.age=18;
		Pxj.name="pengxinjie";
		Pxj.sex="男";
		
		Pxj.say();
		Pxj.say(10);
		Person kjy=new Person("kangjieyu");
		//方法的重载  一个类中的方法若具有相同的名字，系统会根据参数和返回值来匹配正确的类型
		kjy.say();
		
	}
}
