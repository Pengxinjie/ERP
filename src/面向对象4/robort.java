package 面向对象4;

public class robort {
	String name;
	Person Zhuren;
	
	public void say() {
		System.out.println("hello,I'm "+name);
		if(Zhuren.sex.equals("boy"))
		System.out.println("My Zhuren is "+Zhuren.name+
				".he is boy."+Zhuren.age+"year old");
		else {
		System.out.println("My Zhuren is "+Zhuren.name+
				".he is gril."+Zhuren.age+"year old.");
		}
	}
}
