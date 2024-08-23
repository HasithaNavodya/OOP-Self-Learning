/*Contructor Overloading*/
class Box {
    int length;
    int width;
    int height;
    
    public Box(int length, int width, int height){
		this.length = length;
		this.width  = width;
		this.height = height;
		System.out.println("Box(int,int,int)");
	}
	
	public Box(int length){
		this.length = length;
		this.width  = length;
		this.height = length;
		System.out.println("Box(int)");
	}
	
	public Box(){
		this.length = 1;
		this.width  = 1;
		this.height = 1;
		System.out.println("Box()");
	}

    public void printVolume() {
        int volume;
        volume = length * width * height;
        System.out.println("Volume of the box is : " + volume);
    }
}

class Demo5_6_7{
    public static void main(String[] args) {
        Box b1 = new Box();
        Box b2 = new Box(10);
        Box b3 = new Box(12,5,3); //Calling parameterized constructor 
        
		b1.printVolume();
		b2.printVolume();
		b3.printVolume();
    }
}

