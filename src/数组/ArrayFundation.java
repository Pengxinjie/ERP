package ����;

import java.util.Arrays;

public class ArrayFundation {
	public static void main(String[] args) {
		int[] a=new int[5];//����һ�������Ԫ�ص����鲢��ʼ��
		a[3]=9;//�޸ĵ��ĸ�ֵ���±��0��ʼ
		for (int i = 0; i < a.length; i++) {//�������
			System.out.println(a[i]);//Ĭ��ֵΪ0
		}
		//��һ�����������ʽ
		for (int i : a) {
			System.out.print(i);
		}
		
		int b[]=new int[] {0,1,24};//����һ�ֶ��巽ʽ
		for (int i = 0; i < b.length; i++) {
			System.out.println(b[i]);
		}
		//����������κ�����
		String str[]=new String[5];
		
		// ð������
		int m[]= {4,3,6,9,8};
		for (int i = 0; i < m.length-1; i++) {
			for (int j = i; j < m.length-1; j++) {
				if(m[j]>m[j+1])
				{
					int h=m[j];
					m[j]=m[j+1];
					m[j+1]=h;
				}
			}
		}
		System.out.println(Arrays.toString(m));
	}
}
