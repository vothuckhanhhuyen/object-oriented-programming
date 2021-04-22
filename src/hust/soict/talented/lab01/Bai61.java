package hust.soict.talented.lab01;

import java.util.Scanner;

public class Bai61 {

	public static void main(String[] args) {
		
		// The first degree equation (linear equation) with one variable
		// ax + b = 0
		
		Scanner sc = new Scanner(System.in);
		int a, b;
        double x;
         
        System.out.println("Enter a: ");
        a = sc.nextInt();
        System.out.println("Enter b: ");
        b = sc.nextInt();
        System.out.println("Equation: " + a + "x + " + b + " = 0.");
        
        if (a == 0) {
            if (b == 0) {
                System.out.println("Countless solutions.");
            } else {
                System.out.println("No solution.");
            }
        } else {
            x = (double) -b / a;   
            System.out.format("x = %.2f", x);
        }
        
        sc.close();
        
    }
 
}

