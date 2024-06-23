class Program6{
	public static void main(String[] args){
		int a = 10;
		int b;
		b = a++; // Post Increment -> First use, then increase
		System.out.println(a); // 11 
		System.out.println(b); // 10
	}
}