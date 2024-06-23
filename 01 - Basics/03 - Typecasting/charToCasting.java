class charToCasting{
	public static void main(String[] args){
		char a = 'a';
		
		byte b;
		short s;	
		int i;
		long l;
		
		float f;
		double d;
		// b = a; this won't work here
		
		b = (byte) a; // explicit
		
		s = (short) a; // explicit
		
		i = a; // implicit
		
		l =  a; // implicit
		
		f =  a; // implicit
		
		d =  a; // implicit
		
		System.out.println(a); // a
		
		
		System.out.println(b); // 97
		
		System.out.println(s); // 97
		
		
		System.out.println(i); // 97
		
		System.out.println(l); // 97
		
		
		System.out.println(f); // 97.0
		
		
		System.out.println(d); // 97.0
		
		
	}
}