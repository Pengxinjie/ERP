package �������;

public class Test {
	public static void main(String[] args) {
		
		Person Pxj=new Person();//Person�Զ�������      ����������һ����
		Pxj.age=18;
		Pxj.name="pengxinjie";
		Pxj.sex="��";
		
		Pxj.say();
		Pxj.say(10);
		Person kjy=new Person("kangjieyu");
		//����������  һ�����еķ�����������ͬ�����֣�ϵͳ����ݲ����ͷ���ֵ��ƥ����ȷ������
		kjy.say();
		
	}
}
