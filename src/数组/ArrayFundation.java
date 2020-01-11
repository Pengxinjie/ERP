package 数组;

import java.util.Arrays;

public class ArrayFundation {
	public static void main(String[] args) {
		int[] a=new int[5];//创建一个有五个元素的数组并初始化
		a[3]=9;//修改第四个值。下标从0开始
		for (int i = 0; i < a.length; i++) {//数组遍历
			System.out.println(a[i]);//默认值为0
		}
		//另一种数组遍历方式
		for (int i : a) {
			System.out.print(i);
		}
		
		int b[]=new int[] {0,1,24};//另外一种定义方式
		for (int i = 0; i < b.length; i++) {
			System.out.println(b[i]);
		}
		//数组可以是任何类型
		String str[]=new String[5];
		
		// 冒泡排序
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
