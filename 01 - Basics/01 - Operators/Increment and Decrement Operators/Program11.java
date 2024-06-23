class Program11{
	public static void main(String[] args){
		int a = 10;
		int b;
		b = --a + --a; // calculate RHS first then assign to LHS
		System.out.println(a); // 08 
		System.out.println(b); // 17
	}
}