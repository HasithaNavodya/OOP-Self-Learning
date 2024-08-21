class Box{
	int length;		
	int width;		
	int height;		
	
	public void printVolume(){
		int volume; 
		volume = length * width * height;
		System.out.println("Volume of the box is : " + volume);
	}
	
	public void setSize(int length, int width, int height){
		length = length;
		width = width;
		height = height;
	}
}

class Demo5_2{
	public static void main(String[]args){
		Box b1 = new Box();
		b1.setSize(12,5,3);
		System.out.println("length : " + b1.length);
		System.out.println("width  : " + b1.width);
		System.out.println("height : " + b1.height);
		b1.printVolume();
	}
}
