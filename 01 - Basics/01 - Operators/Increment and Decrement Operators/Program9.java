class Program9{
	public static void main(String[] args){
		int a = 10;
		int b;
		b = ++a + ++a; // calculate RHS first then assign to LHS
		System.out.println(a); // 12 
		System.out.println(b); // 23
	}
}