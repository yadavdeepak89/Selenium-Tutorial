package HashMap_employee;

import java.util.HashMap;
import java.util.Set;

public class Details {

	public static void main(String[] args) {
		HashMap<Integer, String> hmap=new HashMap<Integer, String>();
		hmap.put(1, "Name");
		hmap.put(2,"Company");
		hmap.put(3,"username");
		//System.out.println(hmap.get(1));
		
		Set<Integer> keys=hmap.keySet();
		for(Integer key: keys){
			System.out.println(key+"   "+hmap.get(key));
		}
		
		
	}
}
