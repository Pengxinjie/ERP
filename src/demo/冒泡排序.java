package demo;

import java.util.Arrays;

public class ц╟ещеепР {
	public static void main(String[] args)
	{
		int a[]= {6,8,3,9,7,2,5};
		//ц╟ещеепР
		for(int i=0;i<a.length-1;i++)
		{
			for(int j=i+1;j<a.length;j++)
			{
				if(a[i]>a[j])
				{
					int c=a[i];
					a[i]=a[j];
					a[j]=c; 
				}
			}
		}
		
		System.out.println(	Arrays.toString(a));
		for (int i=0;i<a.length;i++)
		{
			System.out.println(a[i]);
		}
	}
}
