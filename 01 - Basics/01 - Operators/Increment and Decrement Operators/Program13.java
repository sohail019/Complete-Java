class Program13{
	public static void main(String[] args){
		int a = 10;
		int b;
		b = ++a + a++ + --a + a-- + ++a; // calculate RHS first then assign to LHS
		System.out.println(a); // 11 
		System.out.println(b); // 55
	}
}