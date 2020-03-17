package sample1;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class Usermaincode3 {

public static void main(String[] args) {
		
	int n;
		HashMap<String,Integer> map=new HashMap<String,Integer>();
		ArrayList<String> list=new ArrayList<String>();
		
		map.put("Venky", 60);
		map.put("sivareddy", 30);
		map.put("Reddisekhar", 80);
		map.put("Deekshitha", 60);
		map.put("Charitha", 30);
		map.put("Tilaka", 80);
		Set set = map.entrySet();
		
		Iterator itr=set.iterator();
		
		while(itr.hasNext()) {
			Map.Entry me=(Map.Entry)itr.next();
			n=(int) me.getValue();
			System.out.println(n);
			if(n>=50) {
				list.add((String) me.getKey());
			}
			
		
		System.out.println(list);
}
}
}
