package week4;

class DateUtills {
	
	public static void compareDate(MyDate d1, MyDate d2) {
		if (d1.getDay() == d2.getDay()
				&& d1.getMonth() == d2.getMonth()
				&& d1.getYear() == d2.getYear()) {
			System.out.println("Two days are the same");
		} else {
			System.out.println("Two days are different");
		}
	}
	
}
