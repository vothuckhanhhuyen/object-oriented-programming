package week1;

import java.util.Scanner;

public class Bai63 {

	public static void main(String[] args) {
		
		// The second degree equation with one variable
		// ax^2 + bx + c = 0
		
		Scanner sc = new Scanner(System.in);
		int a, b, c;
         
        System.out.println("Enter a: ");
        a = sc.nextInt();
        System.out.println("Enter b: ");
        b = sc.nextInt();
        System.out.println("Enter c: ");
        c = sc.nextInt();
        System.out.println("Equation: " + a + "x^2 + " + b + "x + " + c + " = 0.");
        
        double determinant = b * b - 4 * a * c;

        if (determinant > 0) {
        	double x1 = (-b + Math.sqrt(determinant)) / (2 * a);
        	double x2 = (-b - Math.sqrt(determinant)) / (2 * a);
        	System.out.format("x1 = %.2f and x2 = %.2f", x1, x2);
        } else if (determinant == 0) {
        	double x1 = -b / (2 * a);
        	System.out.format("x1 = x2 = %.2f;", x1);
        } else {
        	double real = -b / (2 * a);
        	double imaginary = Math.sqrt(-determinant) / (2 * a);
        	System.out.format("x1 = %.2f+%.2fi", real, imaginary);
        	System.out.format("\nx = %.2f-%.2fi", real, imaginary);
        }
        
        sc.close();
        
	}

}
