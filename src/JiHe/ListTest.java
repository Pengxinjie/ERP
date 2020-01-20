package JiHe;

import java.util.ArrayList;
import java.util.List;

public class ListTest {
	public static void main(String[] args) {
		//声明有个集合，里面全是字符串
		List<String> xx;
		xx=new ArrayList<String>();
		
		xx.add("hello ");
		xx.add("world");
		xx.add("向集合中添加对象");
		
		String str=xx.get(0);//依旧从0开始
		System.out.print(str);
		
		xx.remove(1);
		System.out.println(xx.get(1));//删除后自动前移
		
		System.out.println(xx.size());
		
		//循环迭代
		for(int i=0;i<xx.size();i++)
			System.out.println(xx.get(i));
		//与上面效果相同  foreach循环
		for(String i:xx)
		{
			System.out.println(i);
		}
		
	}
}
