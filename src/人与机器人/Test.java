package ���������;

public class Test {

	public static void main(String[] args) {
		Person ren=new Person();
		ren.age=18;
		ren.name="pxj";
		ren.sex="boy";
		robort a=ren.make("������");	
		
		Person ren2=new Person();
		ren2.age=18;
		ren2.name="kjy";
		ren2.sex="girl";
		
		robort nr=ren.makeFor(ren2);
	    
		//a.say();
		//b.say();
		nr.say();
	}
}
