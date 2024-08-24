class Box1_1{
	int length;
	int width;
	int height;
	
	public void setSize(int l, int w, int h){
		length = l;
		width = w;
		height = h;
	}

	public void printVolume(){
		int volume;
		volume = length * width * height;
		System.out.println("Volume of the box is : "+volume);
	
	
	}

}
