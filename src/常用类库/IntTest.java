package �������;
/*��װ��
 *�������������͵�ֵ��װ��Java����Java����Ϊ�����������Ͷ��ṩ�˰�װ��
 * 
 * ��װ���е�toString����д��
 * ��װ��  ��������  �ַ����� ���Ի���ת��
 */
public class IntTest {
	public static void main(String[] args) {
		int i=20;
		Integer n=new Integer(i);
		Integer m=new Integer(i);
		
		int x=m;
		String s=new String(n.toString());
		System.out.print(s);
		
	}
}