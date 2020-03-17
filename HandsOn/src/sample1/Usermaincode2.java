package sample1;

import java.util.HashMap;
import java.util.Scanner;

public class Usermaincode2 {
	public static void main(String[] args) {
		
		HashMap<String,String> map=new HashMap<String,String>();
		map.put("Karnataka", "Bengaluru");
		map.put("TamilNadu", "Chennai");
		map.put("Telangana", "Hyderabad");
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter State");
		
		
		String str=sc.next();
		
		if(map.containsKey(str)) {
			String s = map.get(str);
			System.out.println(str+" "+s);
		}
		else {
			System.out.println("Not existed");
		}
		

		/*
		 * System.out.println(Str.substring(Str.indexOf('_')+1, Str.length()));
		 * System.out.println(Str.substring(0, Str.indexOf('_'))); Str.substring(0,
		 * Str.length()-1);
		 */
		
	}
}
