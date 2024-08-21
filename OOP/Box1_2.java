class Box1_2{
	int length;
	int width;
	int height;
	
	public void setSize(int l, int w, int h){
		length = l;
		width = w;
		height = h;
	}
	
	public void setLength(int l){
		length = l;
	}
	
	public void setWidth(int w){
		width = w;
	}
	
	public void setHeight(int h){
		height = h;
	}
	
	public int getArea(){
		int area; 
		area = 2 * length * width + 2 * length * height + 2 * width * height; 
		return area;
	}
	
	public void printArea(){
		int area; 
		area = 2 * length * width + 2 * length * height + 2 * width * height; 
		System.out.println("Area of the box is : "+area);
	}

	public void printVolume(){
		int volume;
		volume = length * width * height;
		System.out.println("Volume of the box is : "+volume);
	}
	
	public int getVolume(){
		int volume;
		volume = length * width * height;
		return volume;
	}
}
