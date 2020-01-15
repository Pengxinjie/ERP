package 常用类库;
/*包装类
 *将基本数据类型的值包装成Java对象，Java语言为八种数据类型都提供了包装类
 * 
 * 包装类中的toString被重写了
 * 包装类  数字类型  字符类型 可以互相转换
 */
public class IntTest {
	public static void main(String[] args) {
		int i=20;
		Integer n=new Integer(i);
		Integer m=new Integer(i);
		
		int x=m;
		String s=new String(n.toString());
		System.out.print(s);
		
		//注意类型转换   int 可以转换成  long  ，但long不能转换成       int 
		//大不能转小
		
		//基本数据类型转字符串
		double pi=3.14;
		String x1=Double.toString(pi);
		String x2=new Double(pi).toString();
		String x3=Double.valueOf(pi).toString();
		String x4=""+pi;//想不到吧
		
	}
}