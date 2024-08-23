/*Calling "this(args )"*/
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
		this(length, length, length); //Box(length, length, length);
		System.out.println("Box(int)");
	}
	
	public Box(){
		this(1);
		System.out.println("Box()");
	}

    public void printVolume() {
        int volume;
        volume = length * width * height;
        System.out.println("Volume of the box is : " + volume);
    }
}

class Demo5_6_8{
    public static void main(String[] args) {
        Box b1 = new Box();
		b1.Box(12,5,3);//Illegal (object eka hadala ita passe constructor eka call karanna ba)
    }
}

