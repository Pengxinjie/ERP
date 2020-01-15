package 常用类库;
//Canlendar是个抽象类

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class CalendarTest {
	public static void main(String[] args) {
		Calendar c1=new GregorianCalendar();
		
		Date dt=new Date();
		
		c1.setTime(dt);
		c1.set(Calendar.YEAR, 2016);
		Date ndt=c1.getTime();
		System.out.print(ndt);
		
		
	}
}