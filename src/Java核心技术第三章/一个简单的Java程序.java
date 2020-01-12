package Java核心技术第三章;
/**
 *一.一个简单的Java程序
 *1.Java区分大小写
 *2.public称为访问修饰符，控制程序的其他部分对这段代码的访问级别
 *3.关键字class表示Java的全部内容都包含在类中
 *4.class后紧跟类名，类名的命名规则：字母开头，后面是字母和数字的任意组合（驼峰标识） 
 *5.源代码的文件名必须与公共类的名字相同，并以.java作为扩展名
 *6.从main方法开始执行，main方法必须设定为public
 *7.{}划分程序的各个部分，称为块
 *8.System.out.println中的.用于调用对象的方法，Java通用语法：对象.方法（参数）等价于函数调用
 *
 *二.数据类型
 *有八种基本类型
 *int short long byte     float double        boolean            char
 *数据类型的字节数与平台无关
 *二进制无法精确存储小数，就像十进制无法精确表示三分之一一样
 *
 *三.变量
 *1.变量名是一个以字母开头并由字母或数字构成的序列，字母包括'_','$'（尽量不用）
 *2.另外，不能将保留字作为变量名.
 *3.逐一声明变量，提高程序的可读性
 *4.Java中不区分变量的声明与定义
 *5.常量 关键字final指示常量 类似const,且习惯上变量名用大写
 *6.若希望这个常量可以在一个类中的多个方法中使用     使用关键字  static final 设置类常量
 *注意：类常量的定义位于main方法的外部，因此同一个类中的其他方法也能使用它，如果再声明为public，那么其他类也能使用这个常量
 *
 *四.运算符
 *1.使用strictfp关键字来保证浮点数计算的严格性（public static strictfp void main(String[] args)）
 *
 *五.数学函数与常量
 *1.平方根 sqrt
 *2.幂运算 pow
 *3.解决余数为负数的情况 floorMod
 *4.三角函数 sin cos tan atan atan2
 *5.指数函数及反函数 及以10为底的对数 exp log log10
 *6.不必在数学方法名和常量名前添加前缀 Math,只要在原文件的顶部添加 “import static java.lang.Math.*;”
 *
 *六.类型转换
 *隐式：有double转double,——>有float转float,——>有long转long——>否则都转成int 
 *强制：（想转的类型）变量名  
 *四舍五入Math.round方法，返回long类型，故仍需强制类型转换成int
 *
 *七.运算符
 *注意：不要将boolean类型转换成数值类型！！！！可使用 b?1:0;(条件表达式)
 *自增自减运算符（建议不要在表达式中使用）：略  同c语言
 *关系运算符与boolean运算符，逻辑与，逻辑或，条件操作符 。略 同C语言
 *位运算符：掩码技术获得整数中的各个位    &与   |或   ~非   ^异或（不同为true） ，<<,>>位左移与位右移运算符（>>>会用0填充高位，不存在<<<）
 *运算符优先级和结合性  P45
 *Java中不存在逗号运算符，但可以用，分隔for语句的第一和第三部分表达式列表
 *枚举类型enum
 *
 *八.控制流程
 *与C语言的区别之处
 *1.break语句可以带标签
 *2.变形的for循环
 *3.不能在嵌套的两个块中声明同名的变量
 *
 *九.for循环的另外一种形式（for each 循环）可以用来依次处理数组中的每个元素
 *for(variable:collection)statement
 *定义一个变量variable暂存集合中的每一个元素，并执行相应语句或语句块
 *
 *十.数组拷贝
 *就好像两个不同的指针变量，指向（引用）了同一块内存，改变其中的一个数组，另一个数组也会随之改变
 *
 *十一.如果希望将一个数组中的所有值拷贝到另一个数组中去，或是增加数组的大小，使用Arrays类中的copyOf方法
 *
 *十二.Java数组中的[]运算符被预定义为检查数组边界，而且没有指针运算，不能通过a+1来获得下一个元素
 *
 *十三.命令行参数
 *每个main方法都带有String []args的参数，这个参数表明接收一个字符串数组，也就是命令参数
 *
 *十四.数组排序
 *使用Arrays类中的sort方法（这个算法使用了优化的快速排序算法）
 *
 *
 */

import static java.lang.Math.*;

import java.util.Arrays;
import java.util.Scanner;
enum Size{SMALL,MEDIUM,LARGE};

public class 一个简单的Java程序 {
	static final double PI=3.14;//类常量 置于main方法外部
	
	public static void main(String[] args ) {
		final int BIAN_LIANG=12;
		double a=4;
		double b=Math.sqrt(a);//求平方根
		System.out.println(b);
		
		double c=Math.pow(a, b);//幂运算 a的b次幂
		System.out.println(c);
		
		int p=4;
		int q=-7;
		System.out.println(q%p);
		System.out.println(floorMod(q, p));//消除余数为负数的情况
		
		double ab=9.877;
		int ac=(int)round(ab);
		System.out.println(ac);//四舍五入

		int ScondBitFromp=(p&0b0010)/0b0010;//掩码技术获得指定位 若是1则返回1，否则返回0.
		System.out.println(ScondBitFromp);//记住上面表达式的格式
		
		Size s=Size.MEDIUM;//枚举
		
		Scanner in=new Scanner(System.in);
		
		int []_arr=new int[5];
		for (int i : _arr) {//好处：无需担心下标越界
			System.out.println(i);
		}	
		_arr=new int[] {1,2,3,4,5};//重新初始化一个数组
		
		for (int j : _arr) {
			System.out.println(j);
		}
		
		int []arr1= {1,3,5,7};
		int []arr2=Arrays.copyOf(arr1,2* arr1.length);//将原本的数组大小扩大了一倍
		
		for (int i : arr1) {
			System.out.print(i);
		}
		for (int i : arr2) {
			System.out.print(i);//遍历查看效果，多余元素会被赋值成0，若元素是布尔型，则被赋值成false
			//若长度小于原本数组的大小，则只拷贝前面的数据元素
		}
		
	}
}
