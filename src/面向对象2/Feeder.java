package 面向对象2;

public class Feeder {
	String name;//实例变量
	//final static String TITLE ="饲养者";
	//static int a；静态变量     被所有对象共享
	//喂动物食物
	public void feed(Animal ani,Food fo)//实例方法
	{
		ani.eat(fo);
	}
	
	public static void say(){//静态方法
		System.out.println("我是饲养员！");//不能使用实例属性和实例变量
	}
	
	static String title=null;
	
	//静态代码块   只执行一次，在类被加载的时候被执行，new,调用，main写在类中都会导致类被加载
	static {
		System.out.print(Feeder.title);
	}
	
}
/*static 关键字
 *类成员，类变量，类方法：使用static修饰                           从类的角度出发，无对象也能使用
 * 实例成员，实例变量，实例方法：未使用static修饰 
 */