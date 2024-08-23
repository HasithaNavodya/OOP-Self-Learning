/*Instance block*/
class A {
	int a;
	{
		a=10;
		System.out.println("Calling instance block..."); 
	}
	
	A(){
	
	}
	
	A(int i){
		a=i;
	}
}

class Demo5_7{
    public static void main(String[] args) {
        A a1 = new A();
		A a2 = new A(100);

		System.out.println("a of a1 : "+a1.a); // 10
		System.out.println("a of a2 : "+a2.a); // 100
    }
}

