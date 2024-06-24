class Type4Method{
	public static void main(String[] args){
        int l = 30;
		int b = 14;
		int res = findRectArea(l, b);
		
		System.out.println("Area of Rectangle is " + res);
	}
	
	public static int findRectArea(int l, int b){

		int rectArea = l * b;
		return rectArea; // Return area to the Main method
	}
}
	