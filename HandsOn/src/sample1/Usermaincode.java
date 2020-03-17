package sample1;
import java.io.*;
import java.util.*;

public class Usermaincode {
	

	public static String output1;
public static void main(String[] args) {
	

	ArrayList<String> input1=new ArrayList<String>();
	
	input1.add("abc");
	input1.add("a");

	input1.add("abd");
getString(input1);
}
	public static void getString(ArrayList<String> input1) {
		
		String op="";
		String str;
		char ch;
		for(int i=0;i<input1.size();i++) {
			str=input1.get(i);
			op=op+str.charAt(str.length()-1);
		}
		output1=op;
		System.out.println(output1);
	
	}
}
