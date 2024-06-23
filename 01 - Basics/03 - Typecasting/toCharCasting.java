class toCharCasting{
	public static void main(String[] args){
		
		byte b = 20;
		short s = 25;	
		int i = 80;
		long l = 23423l;
		
		float f = 34.0F;
		double d = 234.0; 
		
		
		
		// byte to char
		char b2c;
		b2c = (char) b; 
		System.out.println(b + " is " + b2c); // ¶
		
		
		// short to char
		char s2c;
		s2c = (char) s; 
		System.out.println(s + " is " + s2c); // ↓
		
	
		// int to char
		char i2c;
		i2c = (char) i; 
		System.out.println(i + " is " + i2c); // P
		
		// long to char
		char l2c;
		l2c = (char) l; 
		System.out.println(l + " is " + l2c); // ?
		
		// float to char
		char f2c;
		f2c = (char) f; 
		System.out.println(f + " is " + f2c); // "
		
		// double to char
		char d2c;
		d2c = (char) d; 
		System.out.println(d + " is " + d2c); // ê
	}
}