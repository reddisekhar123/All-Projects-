package sample1;

import java.util.Arrays;

public class FirstDayAtSchool {

	public boolean res;
	public void checkmyName(String myname) {
		
		if(myname.compareTo("Sanju")==0)
			res=true;
		else
			res=false;
	}
	public String[] prepareMyBag() {
		String[] collegebag= { "Records","NoteBooks","Mobiles"};
		System.out.println("My College Bag contains:"  +Arrays.toString(collegebag));
		return collegebag;
		
	}
	public String []addLaptops(){
		String[]collegebag= {"Records","NoteBooks","Mobiles","Laptops"};
		System.out.println("Now My College Bag contains:"  +Arrays.toString(collegebag));
		return collegebag;
		
	}
	public static void main(String[] args) {
		
		FirstDayAtSchool fds=new FirstDayAtSchool();
		String[] cb=fds.prepareMyBag();
		System.out.println(cb);
		
		for(String s:cb)
			System.out.println("Bag contains:"+s);
		
		String[]Laptops=fds.addLaptops();
		for(String s:Laptops)
			System.out.println("Laptop contains:"+s);
	}
	
	}
