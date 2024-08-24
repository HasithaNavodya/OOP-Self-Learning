/*Constructor*/
class Box {
    int length;
    int width;
    int height;
    
    //Constructor. no return type and with class name "Box"
    Box(){
		length = 1;
		width  = 1;
		height = 1;
		System.out.println("Calling constructor"); 
	}

    public void printVolume() {
        int volume;
        volume = length * width * height;
        System.out.println("Volume of the box is : " + volume);
    }
}

class Demo5_6_5{
    public static void main(String[] args) {
        Box b1 = new Box(); //--> "Box()", calling constructor 
        System.out.println("length of the box  : " + b1.length);
		System.out.println("width  of the box : " + b1.width);
		System.out.println("height of the box : " + b1.height);
    }
}
