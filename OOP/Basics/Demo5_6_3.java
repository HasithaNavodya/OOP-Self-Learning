/*Method call by reference*/
class Box {
    int length;
    int width;
    int height;

    public void printVolume() {
		int volume;
        volume = length * width * height;
        System.out.println("Volume of the box is : " + volume);
    }

    public void setSize(int length, int width, int height) {
		this.length = length;
        this.width  = width;
        this.height = height;
	}
	
	public boolean equal(Box box){
		return this.length == length && this.width == width && this.height == height;
	
	}
}

class Demo5_6_3{
    public static void main(String[] args) {
        Box b1 = new Box();
        b1.setSize(12, 5, 3);
		
        Box b2 = new Box();
        b2.setSize(12, 5, 3);
        
        Box b3 = new Box();
        b3.setSize(120, 50, 30);
        
        Box b4 = b1;
        System.out.println("b1==b2 : "+b1.equal(b2)); //true
        System.out.println("b1==b3 : "+b1.equal(b3)); //true
        System.out.println("b1==b4 : "+b1.equal(b4)); //true
    }
}


