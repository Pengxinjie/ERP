package �̳�;
//��д����ķ���
public class Test {

	public static void main(String[] args) {
		dog a=new dog();
		a.age=12;
		a.name="xixi";
		a.code="1234";

		a.eat();//��д  ���ǣ����أ�����ķ���
		
		//����ת�ͣ��������ʵ��������ֵ���������
		animal an;
		an=new dog();//˵һ������һ������
		an.eat();//ת��֮��Ķ�����ȫ��Ϊ���������ʹ��
		
		dog d=(dog)an;//ǿ������ת��   ����ת��
		d.eatt();
	}
}