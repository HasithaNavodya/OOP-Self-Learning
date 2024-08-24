class Box{
	//----------------------Start Attribute declaration---------------------
	int length;		
	int width;		
	int height;	
	//----------------------End Attribute declaration---------------------
	
	System.out.println("This is class Box");//llegal ?
	
	//----------------------Start Method declaration---------------------
	public void printVolume(){
		int volume; 
		volume = length * width * height;
		System.out.println("Volume of the box is : " + volume);
	}
	
	public void setSize(int length, int width, int height){
		this.length = length;
		this.width = width;
		this.height = height;
	}
	//----------------------End Method declaration---------------------

}

class Demo5_4{
	public static void main(String[]args){
		Box b1 = new Box();
		b1.setSize(12,5,3);
		System.out.println("length of the box : " + b1.length);
		System.out.println("width  of the box : " + b1.width);
		System.out.println("height of the box : " + b1.height);
		b1.printVolume();
	}
}

