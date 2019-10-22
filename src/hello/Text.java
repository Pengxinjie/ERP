package hello;

public class Text {

	public static void main(String[] args) {
		//person为自定义类型
		Person a;	//声明一个人
		a= new Person();//创建一个人
		a.say();//大家好，我叫null,年龄：0性别：null,默认值
		a.name="张三";
		a.age=23;
		a.sex="保密";
		a.say();
	}
}
//方法重载：方法名字相同，但参数列表和返回值不同