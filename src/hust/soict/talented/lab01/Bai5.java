package hust.soict.talented.lab01;

import java.util.Scanner;

public class Bai5 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		double d1 = sc.nextDouble();
		double d2 = sc.nextDouble();
		
		System.out.println(d1 + " + " + d2 + " = " + (d1 + d2));
		System.out.println(d1 + " - " + d2 + " = " + (d1 - d2));
		System.out.println(d1 + " * " + d2 + " = " + (d1 * d2));
		if (d2 == 0) {
			System.out.println("Can not divide " + d1 + " by " + d2);
		} else {
			System.out.println(d1 + " / " + d2 + " = " + (d1 / d2));
		}
		
		sc.close();

	}

}
