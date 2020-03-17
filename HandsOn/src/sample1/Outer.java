package sample1;

public class Outer {

	private static String message="HelloWorld";
	
	private static class MessagePrinter{
		
		public void printMessage() {
			System.out.println("Message from nested static class:"+message);
					
		}
	}
	private class Inner {
		
		public void display(){
			
			System.out.println("Message from non static or inner class:"+message);
			}
		}
	public static void main(String[] args) {
		
		Outer.MessagePrinter printer=new Outer.MessagePrinter();
		
		printer.printMessage();
		
		Outer outer=new Outer();
		
		Outer.Inner inner=outer.new Inner();
		
		inner.display();
		
		Outer.Inner nonStaticInner=new Outer().new Inner();
		
		nonStaticInner.display();
	}
}
