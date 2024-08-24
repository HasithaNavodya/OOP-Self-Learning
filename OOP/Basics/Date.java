class Date{
	int year;
	int month;
	int day;

	public void setDate(int y, int m, int d){
		year = y;
		month = m;
		day = d;
	}
	
	public void printDate(){
		System.out.println(year+"-"+month+"-"+day);
	}
	
	public void setYear(int y){
		year = y;
	}
	
	public void setMonth(int m){
		month = m;
	}
	
	public void setDay(int d){
		day = d;
	}
}
