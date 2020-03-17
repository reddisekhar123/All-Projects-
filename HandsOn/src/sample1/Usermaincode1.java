package sample1;

public class Usermaincode1 {

	public static String method() {
	int num,rem1,rem2,sub;
	num=2945671;
	rem2=0;
	String out="",rev="";
	
	while(num!=0) {
		rem1=num%10;
		if(rem1>rem2) {
			sub=rem1-rem2;
		}
		else {
		sub=rem2-rem1;
		}
		rem2=rem1;
		out+=sub;
		num=num/10;
	}
	for(int i=out.length()-1;i>=0;i--) {
		rev=rev+out.charAt(i);
	}
	return rev;
	}
	public static void main(String[] args) {
		
		System.out.println(method());
	}
}
