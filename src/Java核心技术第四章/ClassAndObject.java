package Java���ļ���������;

import java.time.LocalDate;

/**
 * һ.ʹ�ù�����������ʵ��
 * ������������Ӧ��������ͬ
 * 
 * ��.�����������빹��������
 * �����Ƿ�ֻ���ʶ�������޸Ķ���
 * 
 * @author asus
 *
 */
public class ClassAndObject {
	public static void main(String[] args) {
		LocalDate newYearEve=LocalDate.of(1999,12,31);//������Ķ��󱣴��ڶ��������
		//�õ�������
		int year=newYearEve.getYear();
		int month=newYearEve.getMonthValue();
		int day=newYearEve.getDayOfMonth();
		
	}
}
