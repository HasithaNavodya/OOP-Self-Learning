/*Adding a method*/

class Box{
	int length;		//Attribute declaration
	int width;		//Attribute declaration
	int height;		//Attribute declaration
	
	public void printVolume(){
		int volume; //Local variable
		volume = length * width * height;
		System.out.println("Volume of the box is : " + volume);
	}
}

class Demo4_2{
	public static void main(String[]args){
		Box b1 = new Box();
		b1.length = 12;
		b1.width = 5;
		b1.height = 3;
		b1.printVolume();
	}
}
