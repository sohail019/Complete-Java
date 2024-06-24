class Type1MethodEx1{
	public static void main(String[] args){
		add();
	}
	
	public static void add(){ // Not return any value, not accept any parameter
		int a = 10;
		int b = 20;
		int res = a + b;
		
		System.out.println("Addition is " + res);
	}
}