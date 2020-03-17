package sample1;

 enum Season{WINTER,SPRING,sanju,FALL}

public class EnumExample1 {

	public static void main(String[] args) {
		
		for(Season s:Season.values()) {
			
		
		System.out.println(s);
	}
	System.out.println("Value of WINTER is:"+Season.valueOf("WINTER"));
	
	System.out.println("Value of WINTER is:"+Season.valueOf("WINTER").ordinal());

	System.out.println("Value of sanju is:"+Season.valueOf("sanju").ordinal());

	/*ordinal means position*/
}
}
