package 继承;

public class dog extends animal {//继承非私有，不能继承构造方法
	//扩展
	String code;//编号
	public void eatt() {
		System.out.println("不");
		//super.eat();//执行父类里的同名方法
	}
}