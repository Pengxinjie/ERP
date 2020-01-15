package Exception;
/*
 *Java异常处理机制
 *
 * 异常分类：
 * 1.编译期异常
 * 2.运行时异常（语法正确）
 * ①空指针异常
 * ②算术异常，如分母为0
 * ③类型转换异常
 * ④数组下标越界
 * 
 * 异常处理
 * 使用try，catch，finall
 * 
 * try{
 *    //可能出现异常的代码
 * }
 * catch(ParseExcetion e){
 * 	  //捕获执行的代码
 * }
 * finally{
 * 	  //不管是否发生异常都要执行的代码
 * }
 * 
 * 避免因局部异常导致程序崩溃
 * 可以通过不同异常进行处理
 */
public class Test {
	public static void main(String[] args) throws RenpinException {
		
//		try {
//			int a=10;
//			int b=0;
//			int c=a/b;//算术异常
//			System.out.print("正常运行！");
//			
//			String s=null;
//			s.charAt(1);
//		} catch (Exception e) {//解析异常
//			//有异常出现走catch
//			System.out.print("出现异常！");
//			System.out.print(e);
//			e.printStackTrace();
//			return;//后面不再执行，除了finally
//		}finally {
//			System.out.print("无论如何都执行");
//		}
		Hello ho=null;
		try {
				ho.hi();
		} catch (NullPointerException e) {
			System.out.print("空指针异常");
		}catch (RenpinException e) {
			System.out.print("人品异常");
		}
		
		
	}
}
