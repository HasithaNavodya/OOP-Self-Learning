class Box{
	int length;
	int width;
	int height;
}

class Demo4_1{
	public static void main(String[]args){
		int[] xr;						//Line1
		xr = new int[3];				//Line2
		System.out.println(xr);			//Line3
		xr[0] = 100;					//Line4
		System.out.println(xr[0]);
		
		Box b1;							//Line5 (Line1)
		b1 = new Box();					//Line6 (Line2)
		System.out.println(b1);			//Line7 (Line3)
		b1.length = 12;					//Line8 (Line4)
		System.out.println(b1.length);
	}
}
