/*Parameterized Contructor*/
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

    public void printVolume() {
        int volume;
        volume = length * width * height;
        System.out.println("Volume of the box is : " + volume);
    }
}

class Demo5_6_6{
    public static void main(String[] args) {
        Box b1 = new Box(12,5,3); //Calling parameterized constructor 
        System.out.println("length of b1 : " + b1.length);
		System.out.println("width  of b1 : " + b1.width);
		System.out.println("height of b1 : " + b1.height);
		b1.printVolume();
		
		Box b2 = new Box(); //lllegal ?
    }
}
