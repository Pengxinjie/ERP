package �������2;

public class Feeder {
	String name;//ʵ������
	//final static String TITLE ="������";
	//static int a����̬����     �����ж�����
	//ι����ʳ��
	public void feed(Animal ani,Food fo)//ʵ������
	{
		ani.eat(fo);
	}
	
	public static void say(){//��̬����
		System.out.println("��������Ա��");//����ʹ��ʵ�����Ժ�ʵ������
	}
	
	static String title=null;
	
	//��̬�����   ִֻ��һ�Σ����౻���ص�ʱ��ִ�У�new,���ã�mainд�����ж��ᵼ���౻����
	static {
		System.out.print(Feeder.title);
	}
	
}
/*static �ؼ���
 *���Ա����������෽����ʹ��static����                           ����ĽǶȳ������޶���Ҳ��ʹ��
 * ʵ����Ա��ʵ��������ʵ��������δʹ��static���� 
 */