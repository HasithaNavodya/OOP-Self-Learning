class Box1_3{
	int length;
	int width;
	int height;
	
	public void setSize(int length, int width, int height){
		this.length = length;
		this.width = width;
		this.height = height;
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
