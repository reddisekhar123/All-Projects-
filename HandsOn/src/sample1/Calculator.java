package sample1;

public class Calculator {
	public Calculator() {
		
	
super();
}
public int factorial(int a) {
	int f=1;
	for(int i=1;i<=a;i++) {
		f=f*i;
	}
	return f;
}
public static void main(String[] args) {
	int a=5;
	Calculator cc=new Calculator();
	System.out.println(cc.factorial(a));
   }
}