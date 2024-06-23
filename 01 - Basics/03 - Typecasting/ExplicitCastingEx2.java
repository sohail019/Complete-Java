class ExplicitCastingEx2{
	public static void main(String[] args){
		double a = 450.4877454;
		int b;
		
		// b = a; this won't work here
		
		b = (int) a;
		
		System.out.println(a); // 450.4877454
		System.out.println(b); // 450
	}
}