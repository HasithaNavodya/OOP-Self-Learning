class MyClass{
	int a;		
	
	public void myMethod(){
		System.out.println(this);
	}
}

class Demo5_1{
	public static void main(String[]args){
		MyClass c1 = new MyClass();
		System.out.println(c1);
		c1.myMethod();
		
		MyClass c2 = new MyClass();
		System.out.println(c2);
		c2.myMethod();
		
	}
}

