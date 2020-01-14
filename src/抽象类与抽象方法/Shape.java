package 抽象类与抽象方法;

public abstract  class Shape {
	//抽象方法的语法
	//[修饰符]abstract 返回值类型 方法名 （[参数列表]）；
	//注意：抽象方法没有方法体
	
	String name;
	
	public abstract double area();
	//求面积的抽象方法
	public abstract double girth();
	//求周长的抽象方法
	
}