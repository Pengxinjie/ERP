package 面向对象2;

public class test {
	public static void main(String[] args) {
		
		Feeder fe=new Feeder();
		fe.name="pxj";
		Animal an=new Animal();
		an.name="猫";
		Food foo=new Food();
		foo.name="肉";
		fe.feed(an, foo);
		
		Feeder.say();
		
	}
}
