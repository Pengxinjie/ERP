package �������;

public class StringBufferTest {
	public static void main(String[] args) {
		StringBuffer a=new StringBuffer("He");
		a.append("llo");
		
		StringBuffer b=a;
		
		a.append("orld");
		
		a.insert(5, "w");//�����λ�ú����ֵ
		
		System.out.print(a);
		
		String x=a.toString();//����ת��
		
		//StringBuffer �̰߳�ȫ��Ч�ʵ�Щ                                   ���Ŷ�����������
		//StringBuilder �̲߳���ȫ��Ч�ʸ�Щ                            ������ͬʱ������
	}
}