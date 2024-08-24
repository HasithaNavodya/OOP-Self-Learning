/*Static Methods*/

class Test {
	
	int a = 100;
	
	static int b = 200; 
	
	static {
		System.out.println("static blocks...");
	}
	
	{
		System.out.println("instance blocks...");
	}
}

class Demo5_8_5{
    public static void main(String[] args) {
        Test t1 = new Test();
        Test t2 = new Test();
        Test t3 = new Test();
    }
}




