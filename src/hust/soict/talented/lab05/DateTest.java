package hust.soict.talented.lab05;

class DateTest {
	public static void main(String[] args) {
		MyDate myDate1 = new MyDate("first", "June", "twenty twenty one");
		myDate1.printDate("yyyy-MM-dd");
		MyDate myDate2 = new MyDate(04, 06, 2001);
		MyDate myDate3 = new MyDate();
		
		DateUtils.printCompare(myDate1, myDate2);
		DateUtils.printCompare(myDate1, myDate3);
		
		MyDate[] dateList = {myDate1, myDate2, myDate3};
		DateUtils.sortDate(dateList);
	}
}
