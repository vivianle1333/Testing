import java.lang.System;


public class something {
	public something() {
		String a = "hello somthing";
		
		System.out.println(a);
	}
	
	private static void doingstuff() {
		System.out.println(1+1);
	}
	
	public static void main(String[] args) {
		something b = new something();
		System.out.println("this is cool");
		doingstuff();
	}
}
