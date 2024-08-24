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
    
    public void copyValuesFrom(Box box){
		this.length = box.length;
		this.width  = box.width;
		this.height = box.height; 
	}
}

class Demo5_6_1{
    public static void main(String[] args) {
        Box b1 = new Box();
        b1.setSize(12, 5, 3);
        b1.printVolume();

        Box b2 = new Box();
        b2.setSize(120, 50, 30);
        b2.printVolume();
        System.out.println(b1 == b2); // false

        b1.copyValuesFrom(b2);
        
        b1.printVolume();  // 180,000
        b2.printVolume();  // 180,000
        System.out.println(b1 == b2); // false
    }
}
