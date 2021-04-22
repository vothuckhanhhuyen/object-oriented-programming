package hust.soict.talented.lab03;

class DateTest {
	public static void main(String[] args) {
		MyDate myDate1 = new MyDate(04, 06, 2001);
		myDate1.printDate();

		MyDate myDate2 = new MyDate("June 04th 2001");
		myDate2.printDate();
		
		MyDate myDate3 = new MyDate();
		myDate3.accept();
		myDate3.printDate();
	}
}
