/*Adding a  Parameterized method*/

class Box{
	int length;		
	int width;		
	int height;		
	
	public void printVolume(){
		int volume; 
		volume = length * width * height;
		System.out.println("Volume of the box is : " + volume);
	}
	
	public void setSize(int l, int w, int h){
		length = l;
		width = w;
		height = h;
	}
}

class Demo4_3{
	public static void main(String[]args){
		Box b1 = new Box();
		b1.setSize(12,5,3);
		b1.printVolume();
	}
}
