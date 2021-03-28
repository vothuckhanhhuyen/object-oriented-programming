package week3;

import java.util.Scanner;

class MyDate {
	private int day;
	private int month;
	private int year;
	public int getDay() {
		return day;
	}
	public void setDay(int day) {
		this.day = day;
	}
	public int getMonth() {
		return month;
	}
	public void setMonth(int month) {
		this.month = month;
	}
	public int getYear() {
		return year;
	}
	public void setYear(int year) {
		this.year = year;
	}
	
	// Constructors
	public MyDate() {
		
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
		Scanner keyboard = new Scanner(System.in);
		String date = keyboard.nextLine();
		String[] parts = date.split(" ");
		String[] parts1 = parts[1].split("");
		this.day = Integer.parseInt(parts1[0] + parts1[1]);
		this.year = Integer.parseInt(parts[2]);
		switch(parts[0]) {
			case "January": this.month = 1; keyboard.close(); return;
			case "February": this.month = 2; keyboard.close(); return;
			case "March": this.month = 3; keyboard.close(); return;
			case "April": this.month = 4; keyboard.close(); return;
			case "May": this.month = 5; keyboard.close(); return;
			case "June": this.month = 6; keyboard.close(); return;
			case "July": this.month = 7; keyboard.close(); return;
			case "August": this.month = 8; keyboard.close(); return;
			case "September": this.month = 9; keyboard.close(); return;
			case "October": this.month = 10; keyboard.close(); return;
			case "November": this.month = 11; keyboard.close(); return;
			case "December": this.month = 12; keyboard.close(); return;
		}
		keyboard.close();
	}
	
	public void printDate() {
		System.out.println("Date: " + day + "-" + month + "-" + year);
	}
}
