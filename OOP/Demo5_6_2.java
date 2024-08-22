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
	
	public Box getCopy(){
		Box b1 = new Box();
		/*b1.setSize(this.length, this.width, this.height);*/
		b1.length = this.length;
		b1.width  = this.width;
		b1.height = this.height;
		return b1; // "return this" --> wrong(ekama address eka return wenne)
	}
}

class Demo5_6_2{
    public static void main(String[] args) {
        Box b1 = new Box();
        b1.setSize(12, 5, 3);
		
        Box b2 = b1.getCopy();
        
        System.out.println(b1==b2);
        b1.printVolume(); //180
        b2.printVolume(); //180
    }
}

