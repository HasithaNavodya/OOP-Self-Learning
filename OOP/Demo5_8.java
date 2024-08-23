/*Static initialization(Static variable, static method and static block)*/
/*Static variable*/

class Test {
	int a;
	int b;
}

class Demo5_8_1{
    public static void main(String[] args) {
        Test t1 = new Test();
        t1.a = 1;
        t1.b = 2;

		Test t2 = new Test();
		t2.a = 10;
		t2.b = 20;
		
		Test t3 = new Test();
		t3.a = 100;
		t3.b = 200;
		
		System.out.println("t1 : "+t1.a+" "+t1.b); // 1 2
		System.out.println("t2 : "+t2.a+" "+t2.b); // 10 20
		System.out.println("t3 : "+t3.a+" "+t3.b); // 100 200
    }
}

