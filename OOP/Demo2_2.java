import javax.swing.*;
class Demo2_2{
	public static void main(String[]args){
		Box1_2 b1 = new Box1_2();
		b1.setSize(12,5,3);
		b1.printVolume();
		b1.printArea();
		
		b1.setLength(120);
		b1.setWidth(50);
		b1.setHeight(30);
		
		int vol;
		vol = b1.getVolume();
		System.out.println("New Volume of the box is : "+vol);
		
		int area;
		area = b1.getArea();
		System.out.println("New Area of the box is : "+area);
	
	}

}

