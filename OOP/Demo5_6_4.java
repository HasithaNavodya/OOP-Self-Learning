/*Method call by reference*/
class Test {
	int x;				//Primitive attributes
	double d;
	boolean bool;
	int[]xr;			//Reference attributes
	Box b1;				//Reference attributes
}

class Demo5_9{
    public static void main(String[] args) {
		Test t1 = new Test();
		System.out.println(t1.x);		//0
		System.out.println(t1.d);		//0.0
		System.out.println(t1.bool);	//false
		System.out.println(t1.xr);		//null
		System.out.println(t1.b1);		//null
		
		t1.x    = 100;
		t1.d    = 12.34;
		t1.bool = true;
		t1.xr   = new int[4];
		t1.b1   = new Box();
    }
}



