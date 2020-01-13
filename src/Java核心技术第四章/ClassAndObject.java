package Java核心技术第四章;

import java.time.LocalDate;

/**
 * 一.使用构造器构造新实例
 * 构造器的名字应与类名相同
 * 
 * 二.更改器方法与构造器方法
 * 区别：是否只访问对象而不修改对象
 * 
 * @author asus
 *
 */
public class ClassAndObject {
	public static void main(String[] args) {
		LocalDate newYearEve=LocalDate.of(1999,12,31);//将构造的对象保存在对象变量中
		//得到年月日
		int year=newYearEve.getYear();
		int month=newYearEve.getMonthValue();
		int day=newYearEve.getDayOfMonth();
		
	}
}
