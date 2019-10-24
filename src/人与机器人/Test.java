package 人与机器人;

public class Test {

	public static void main(String[] args) {
		Person ren=new Person();
		ren.age=18;
		ren.name="pxj";
		ren.sex="boy";
		robort a=ren.make();
		a.name="擎天柱";
		a.say();
	}
}
