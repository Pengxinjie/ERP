package �������4;

public class Person {
	String name;
	String sex;
	int age;
	
	public robort make(String RobotName) {
		robort r=new robort();
		r.Zhuren=this;//���Լ�      ----------->�ؼ���
		r.name=RobotName;
		return r;
	}
	public robort makeFor(Person pe) {
		robort mm=new robort();
		mm.Zhuren=pe;  //�ѿͻ���Ϊ�����˵�����
		
		return mm;
	}
}