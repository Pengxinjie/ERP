package �������3;

public class Person {
	private String name="����";//��װ
	private String sex;
	private int age;
	
	public String getName() {//�����ʲô
		if(Math.random()<0.8)
			return this.name;
		else
			return "�������㣡";
	}
	
	public void setName(String name) {
		this.name=name;//this����ǰ����Person��Ҳ�ܵ����������췽��
	}
}