package hello;

public class Text {

	public static void main(String[] args) {
		//personΪ�Զ�������
		Person a;	//����һ����
		a= new Person("����");//����һ����
		a.say();//��Һã��ҽ�null,���䣺0�Ա�null,Ĭ��ֵ
		a.age=23;
		a.sex="����";
		a.say();
		
		Person zf=new Person("�ŷ�",23,"��");
		zf.say();
	}
}
//�������أ�����������ͬ���������б�ͷ���ֵ��ͬ