package JiHe;

import java.security.KeyStore.Entry;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MapTest {
	public static void main(String[] args ) {
		Map<String, Double> price=new HashMap<>();
		
		price.put("��ͨ�û�", 5000.0);
		price.put("VIP", 4000.0);
		price.put("שʯVIP", 9000.0);
		price.put("��ͨ�û�", 6000.0);//����ǰ�������
	
		System.out.println(price); 
		System.out.println(price.get("��ͨ�û�"));
		
		Set< java.util.Map.Entry<String, Double> > ens=price.entrySet();
		for(java.util.Map.Entry<String, Double> en:ens)
		{
			System.out.print(en.getKey()+",");
			System.out.println(en.getValue());
		}
		
		//���÷���
		price.containsKey("��ͨ�û�");
		price.containsValue(787.0);
	}
}