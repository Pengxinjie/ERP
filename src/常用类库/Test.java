package �������;

import java.lang.*;
//Ĭ��
public class Test extends Object {//��дĬ��
	public static void main(String[] args) {
		Student st =new Student();
		Student st2=new Student();
		
		//�ж����������Ƿ���ȣ�Ĭ�϶Ա�����������ڴ��ַ
		st.equals(st2);
		
		//�Ѷ���ת�����ַ�����Ĭ��ת���ɶ�����ڴ��ַ
		String str=st.toString();
		
		//Υ���ַ�
		String s="������ӭ�㣡������ӭ��";
		System.out.print(s.replaceAll("��", "*"));
		System.out.println(s.replaceFirst("��", "*"));//ֻ�滻��һ�γ��ֵ��ַ���
		System.out.println(s.endsWith("��"));//�ж��Ƿ���ĳ���ַ�����β
	}
}