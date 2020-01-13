package 面向对象3;

public class Person {
	private String name="无名";//封装
	private String sex;
	private int age;
	
	public String getName() {//问你叫什么
		if(Math.random()<0.8)
			return this.name;
		else
			return "不告诉你！";
	}
	
	public void setName(String name) {
		this.name=name;//this代表当前对象Person，也能调用其他构造方法
	}
}