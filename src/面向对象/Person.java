package �������;
/**
 * ���ࣨ���壬��Ⱥ�����
 * @author asus
 *
 */
public class Person {//        ������    һ����
	String name;
	int age;
	String sex;
	/*
	 * ���췽����������������ķ���
	 * ������������ͬ����д����ֵ����
	 * ���췽��ֻ��new��ʱ�򱻵���
	 * ��дϵͳĬ���޲ι��죡
	 * 
	 * �����Ǳ�д���вι��죬Ĭ���޲ξ�û��
	 * */
	public Person() {
		// TODO Auto-generated constructor stub
	}
	public Person(String mingzi) {
		name=mingzi;
	}
	
	public void say(int a){
		System.out.print("�ҽУ�"+name+" ���䣺"+age+" �Ա�"+sex);
	}
	
	public void say(){
		System.out.print("��Һã��ҽУ�"+name+" ���䣺"+age+" �Ա�"+sex);
	}
}
