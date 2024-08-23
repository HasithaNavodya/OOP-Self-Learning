/*Static initialization(Static variable, static method and static block)*/
/*Static variable*/

class Test {
	int a = 100;
	static int b = 200;
}

class Demo5_8_3{
    public static void main(String[] args) {
        System.out.println("b : "+Test.b); // Legal --> 200;
		
		//Test.a = 100; //Illegal
		
		Test t1 = new Test();
		System.out.println("b : "+t1.b); // Legal --> 200;
    }
}


