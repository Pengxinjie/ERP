package 继承;
//重写父类的方法
public class Test {

	public static void main(String[] args) {
		dog a=new dog();
		a.age=12;
		a.name="xixi";
		a.code="1234";

		a.eat();//重写  覆盖（隐藏）父类的方法
		
		//向上转型：用子类的实例变量赋值给父类变量
		animal an;
		an=new dog();//说一条狗是一个动物
		an.eat();//转型之后的对象完全作为父类对象来使用
		
		dog d=(dog)an;//强制类型转换   向下转型
		d.eatt();
	}
}