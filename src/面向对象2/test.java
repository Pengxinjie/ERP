package �������2;

public class test {
	public static void main(String[] args) {
		
		Feeder fe=new Feeder();
		fe.name="pxj";
		Animal an=new Animal();
		an.name="è";
		Food foo=new Food();
		foo.name="��";
		fe.feed(an, foo);
		
		Feeder.say();
		
	}
}
