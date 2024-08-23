/*Static Methods*/

class Test {
	
	public void mA(){
		System.out.println("mA, instance method");
	}
	
	public static void mB(){
		System.out.println("mB, static method");
	}
	
	
}

class Demo5_8_4{
    public static void main(String[] args) {
        Test.mB(); //Legal
        Test t1 = null; /*null assign karanawa kiyanne initialize karanawa ekata*/
        t1.mB();
    }
}



