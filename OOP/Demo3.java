class Demo3{
	public static void main(String[]args){
		Date d1 = new Date();
		d1.setDate(1999,12,31);
		d1.printDate(); //1999-12-31
		
		d1.setYear(2021);
		d1.setMonth(4);
		d1.setDay(26);
		d1.printDate(); //2021-4-26
	}
}
