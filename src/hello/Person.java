package hello;
//�������
public class Person {
	String name;
	int age;
	String sex;
	/* ���췽����������������ķ���
	 * ���ֺ�������ͬ����д����ֵ����*/
	//ֻ��һ������»ᱻ���ã��Ǿ���new
	public Person(String name) {//��д����Ĭ���޲���
		this.name=name;
	}
	
	public Person(String name,int age,String sex) {
		this.name=name;
		this.age=age;
		this.sex=sex;
	}
	
	public void say(){//�����Լ�
		System.out.println("��Һã��ҽ�"+name+",���䣺"+age+"�Ա�"+sex);
	}
}
