package JiHe;

import java.security.KeyStore.Entry;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MapTest {
	public static void main(String[] args ) {
		Map<String, Double> price=new HashMap<>();
		
		price.put("普通用户", 5000.0);
		price.put("VIP", 4000.0);
		price.put("砖石VIP", 9000.0);
		price.put("普通用户", 6000.0);//覆盖前面的数据
	
		System.out.println(price); 
		System.out.println(price.get("普通用户"));
		
		Set< java.util.Map.Entry<String, Double> > ens=price.entrySet();
		for(java.util.Map.Entry<String, Double> en:ens)
		{
			System.out.print(en.getKey()+",");
			System.out.println(en.getValue());
		}
		
		//常用方法
		price.containsKey("普通用户");
		price.containsValue(787.0);
	}
}