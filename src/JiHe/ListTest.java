package JiHe;

import java.util.ArrayList;
import java.util.List;

public class ListTest {
	public static void main(String[] args) {
		//�����и����ϣ�����ȫ���ַ���
		List<String> xx;
		xx=new ArrayList<String>();
		
		xx.add("hello ");
		xx.add("world");
		xx.add("�򼯺�����Ӷ���");
		
		String str=xx.get(0);//���ɴ�0��ʼ
		System.out.print(str);
		
		xx.remove(1);
		System.out.println(xx.get(1));//ɾ�����Զ�ǰ��
		
		System.out.println(xx.size());
		
		//ѭ������
		for(int i=0;i<xx.size();i++)
			System.out.println(xx.get(i));
		//������Ч����ͬ  foreachѭ��
		for(String i:xx)
		{
			System.out.println(i);
		}
		
	}
}
