package hust.soict.talented.lab03;

import java.util.Scanner;
import java.time.*;

class MyDate {
	private int day;
	private int month;
	private int year;
	
	public int getDay() {
		return day;
	}
	public void setDay(int day) {
		if ((day > 31) || (day < 1))
		{
			System.out.println("Invalid day to set to day value");
			return;
		}
		this.day = day;
	}
	
	public int getMonth() {
		return month;
	}
	public void setMonth(int month) {
		if ((month > 12) || (month < 1))
		{
			System.out.println("Invalid month to set to month value");
			return;
		}
		this.month = month;
	}
	
	public int getYear() {
		return year;
	}
	public void setYear(int year) {
		if (year < 0)
		{
			System.out.println("Invalid year to set to year value");	
			return;
		}
		this.year = year;
	}
	
	// Constructors
	public MyDate() {
		LocalDate currentDate = LocalDate.now();
		this.day = currentDate.getDayOfMonth();
		this.month = currentDate.getMonthValue();
		this.year = currentDate.getYear();
	}
	public MyDate(int day, int month, int year) {
		super();
		this.day = day;
		this.month = month;
		this.year = year;
	}
	public MyDate(String str) {
		String[] parts = str.split(" ");
		String[] parts1 = parts[1].split("");
		this.day = Integer.parseInt(parts1[0] + parts1[1]);
		this.year = Integer.parseInt(parts[2]);
		switch(parts[0]) {
			case "January": this.month = 1; return;
			case "February": this.month = 2; return;
			case "March": this.month = 3; return;
			case "April": this.month = 4; return;
			case "May": this.month = 5; return;
			case "June": this.month = 6; return;
			case "July": this.month = 7; return;
			case "August": this.month = 8; return;
			case "September": this.month = 9; return;
			case "October": this.month = 10; return;
			case "November": this.month = 11; return;
			case "December": this.month = 12; return;
		}
	}
	
	// Functions
	public void accept() {
		System.out.println("Enter your date: ");
		
		Scanner keyboard = new Scanner(System.in);
		String strDate = keyboard.nextLine();
		
		MyDate currentDate = new MyDate(strDate);
		this.setDay(currentDate.getDay());
		this.setMonth(currentDate.getMonth());
		this.setYear(currentDate.getYear());
		
		keyboard.close();
	}
	
	public void printDate() {
		System.out.println("Date: " + day + "-" + month + "-" + year);
	}
}
