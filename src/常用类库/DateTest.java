package 常用类库;
import java.util.*;

public class DateTest {
	public static void main(String[] args) {
		Date dt =new Date();//系统当前时间
		Date dt2=new Date(876868759987l);//指定时间
		
		System.out.println(dt);
		System.out.println(dt.getDate());
		System.out.print(dt.getYear());
	}
}
