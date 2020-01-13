package 面向对象2;

public class Animal {
	String name;
	
	public void eat(Food food) {
		System.out.print(this.name+"吃"+food.name);
	}
}
