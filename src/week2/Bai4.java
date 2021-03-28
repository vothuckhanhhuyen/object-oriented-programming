package week2;

import java.util.Scanner;

public class Bai4 {

	public static void main(String[] args) {
		
		Scanner keyboard = new Scanner(System.in);
		
		int n = keyboard.nextInt();
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < 2 * n - 3 - i; j++) {
				System.out.print(' ');
			}
			for (int k = 0; k < 2 * i + 1; k++) {
				System.out.print('*');
			}
			System.out.print('\n');
		}
		
		keyboard.close();

	}

}
