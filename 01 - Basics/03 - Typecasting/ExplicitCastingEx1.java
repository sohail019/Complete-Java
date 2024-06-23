class ExplicitCastingEx1{
	public static void main(String[] args){
		short a = 25;
		byte b;
		
		// b = a; this won't work here
		
		b = (byte) a;
		
		System.out.println(a); // 25
		System.out.println(b); // 25
	}
}