package Java���ļ���������;

/**    
 * �ַ�������������������
 * */

public class Str {
	public static void main(String[] args)
	{
		String greeting ="hello";
		String s=greeting.substring(0,3);
		System.out.println(s);
		//substring ��ȡ�Ӵ��ķ���
		
		String st=s+"PG"+13;
		System.out.println(st);
		//�κ�һ��java������ת�����ַ���
		/* String �����Ϊ���ɱ��ַ���������substring������ȡ�Ӵ�Ȼ�����ƴ��
		 * �ŵ㣺�������ַ�������
		 * */
		
		String all=String.join("%","abc","def","fef");//��һ������Ϊ�ָ���  ���������ַ����ָ���
		System.out.println(all);
		
		/*����ַ����Ƿ����
		s.equals(t);           �÷������ִ�Сд
		��s��t����򷵻�true����֮����false
		*/
		boolean a;
		a=greeting.substring(0,3).equals("Hel"); 
		System.out.println(a);
		//�������ִ�Сд��ʹ��equalsIgnoreCase����
		a=greeting.substring(0,3).equalsIgnoreCase("Hel"); 
		System.out.println(a);
		//����ʹ��==���ж��ַ����Ƿ���ȣ���
		//����һ�ֱȽ��ַ����ķ��� compareTo
		int b;
		b=greeting.substring(0,3).compareTo("hel");//��ͬ����0�������Сд 
		System.out.println(b);
		
		//length���������ַ�������Ҫ�Ĵ��뵥Ԫ����
		int c;
		c=greeting.length();
		System.out.println(c);
		
		//�õ������������ʵ�ʳ��� codePoint
		c=greeting.codePointCount(0, greeting.length());
		System.out.println(c);
		
		/*����λ��n����㵥Ԫ�ķ�����charAt(n)*/
		char ch=greeting.charAt(2);
		System.out.println(ch);
		//������ʹ��char���ͣ�̫�ײ���
		
		StringBuilder builder =new StringBuilder();//�������ַ���������
		builder.append("af");
		builder.append("ge");
		String ss=builder.toString();
		System.out.print(ss);//ת�����ַ���
		
	}
}
