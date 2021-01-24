package _02_gotta_catchem_all;

public class ExceptionMethods {
	
	public static double divide(double d1, double d2) {
		double quotient = d1/d2;
		if(d2 == 0.0) {
			throw new IllegalArgumentException();
		}
		return quotient;
	}
	
	public static String reverseString(String string) {
		if(string.isEmpty()) {
			throw new IllegalStateException();
		}
		
		String s = "";
		for(int i = string.length()-1; i>=0; i++) {
			s = s + string.charAt(i);
		}
;		return s;
	}
}
