class Type3Method{
	public static void main(String[] args){
		int res = findRectArea();
		
		System.out.println("Area of Rectangle is " + res);
	}
	
	public static int findRectArea(){
		int l = 30;
		int b = 14;
		int rectArea = l * b;
		
		return rectArea; // Return area to the Main method
	}
}
	