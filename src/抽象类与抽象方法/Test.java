package 抽象类与抽象方法;

public class Test {
	public static void main(String[] args) {
		//Shape s=new Shape();错误写法
		Circle yuan=new Circle();
		yuan.r=10;
		System.out.println(yuan.area());
		System.out.println(yuan.girth());
	}
}