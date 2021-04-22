package hust.soict.talented.lab01;

import java.util.Scanner;

public class Bai62 {

	public static void main(String[] args) {
		
		// The first degree equation (linear equation) with two variables
		// ax + by + c = 0 (a, b is different from 0 )
		
		Scanner sc = new Scanner(System.in);
		int a, b, c;
         
        System.out.println("Enter a: ");
        a = sc.nextInt();
        System.out.println("Enter b: ");
        b = sc.nextInt();
        System.out.println("Enter c: ");
        c = sc.nextInt();
        System.out.println("Equation: " + a + "x + " + b + "y + " + c + " = 0.");
        
        System.out.println("a = t, t in R");
        System.out.println("b = - (c + a * t) / b");
        
        sc.close();

	}

}
