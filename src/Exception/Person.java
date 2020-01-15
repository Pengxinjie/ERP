package Exception;

import java.sql.Date;
import java.text.ParseException;
import java.text.SimpleDateFormat;

public class Person {
	
	public void say() throws ParseException{
		String str="2020-01-15";
		SimpleDateFormat df=new SimpleDateFormat("yyyy-MM-dd");
		
		Date dt = (Date) df.parse(str);
		
	}
	
	public static void main(String[] args) throws ParseException {
		Person p=new Person();
		p.say();//异常可以到处抛😂
	}
	
}
