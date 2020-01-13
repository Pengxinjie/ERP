package 面向对象4;

public class Person {
	String name;
	String sex;
	int age;
	
	public robort make(String RobotName) {
		robort r=new robort();
		r.Zhuren=this;//我自己      ----------->关键步
		r.name=RobotName;
		return r;
	}
	public robort makeFor(Person pe) {
		robort mm=new robort();
		mm.Zhuren=pe;  //把客户作为机器人的主人
		
		return mm;
	}
}