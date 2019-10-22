package demo;//数组

import java.util.Scanner;
public class Hello2 {
	public static void main(String[] args)
	{
		int a[] =new int[5];//与c语言的区别  int a[5];
		a[0]=1;
		a[3]=100;
		System.out.println(a[1]);//默认值为零
		int [] b=new int[] {1,2,3,4,5};
		System.out.println(a.length);//获得数组a的长度
		System.out.println(a[a.length-2]);//获得数组倒数第二个值，注意是-2！
		
		//数组能承载任何类型
		String m[]= new String[]{"asd","dgg"};
		System.out.println(m[0]);
		
		for(int i=0;i<a.length;i++)//循环遍历数组
			System.out.println(a[i]);
		
	}
}