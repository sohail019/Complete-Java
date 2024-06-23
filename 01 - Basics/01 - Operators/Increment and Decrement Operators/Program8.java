class Program8{
	public static void main(String[] args){
		int a = 10;
		int b;
		b = a--; // Post Decrement -> First use, then decrease
		System.out.println(a); // 9 
		System.out.println(b); // 10
	}
}