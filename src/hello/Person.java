package hello;
//类与对象
public class Person {
	String name;
	int age;
	String sex;
	/* 构造方法：用来构建对象的方法
	 * 名字和类名相同，不写返回值类型*/
	//只有一种情况下会被调用，那就是new
	public Person(String name) {//不写参数默认无参数
		this.name=name;
	}
	
	public Person(String name,int age,String sex) {
		this.name=name;
		this.age=age;
		this.sex=sex;
	}
	
	public void say(){//介绍自己
		System.out.println("大家好，我叫"+name+",年龄："+age+"性别："+sex);
	}
}
