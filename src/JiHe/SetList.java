package JiHe;

import java.util.Date;
import java.util.HashSet;
import java.util.Set;

public class SetList {

	public static void main(String[] args) {
		
		Date a=new Date(1579522626552l);
		Date b=new Date(1579522626553l);
		Date c=new Date(1579522626554l);
		Date d=new Date(1579522626555l);
		//声明一个Set集合，里面全是时间,Set是无序集合
		Set<Date> sj;	

		sj=new HashSet<Date>();
		boolean b1=sj.add(a);
		boolean b2=sj.add(a);//添加失败
		boolean b3=sj.add(b);
		boolean b4=sj.add(c);
		boolean b5=sj.add(d);
			 		
		for(Date dt:sj)
			System.out.println(dt);
		
		System.out.println(b1);
		System.out.println(b2);
		
	}

}
