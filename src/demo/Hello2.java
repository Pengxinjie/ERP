package demo;//����

import java.util.Scanner;
public class Hello2 {
	public static void main(String[] args)
	{
		int a[] =new int[5];//��c���Ե�����  int a[5];
		a[0]=1;
		a[3]=100;
		System.out.println(a[1]);//Ĭ��ֵΪ��
		int [] b=new int[] {1,2,3,4,5};
		System.out.println(a.length);//�������a�ĳ���
		System.out.println(a[a.length-2]);//������鵹���ڶ���ֵ��ע����-2��
		
		//�����ܳ����κ�����
		String m[]= new String[]{"asd","dgg"};
		System.out.println(m[0]);
		
		for(int i=0;i<a.length;i++)//ѭ����������
			System.out.println(a[i]);
		
	}
}