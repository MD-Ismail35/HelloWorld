import java.util.Scanner;

import static java.lang.Math.sqrt;

public class QuadraticEquation {
    public static void main(String [] args)
    {
        Scanner quadratic = new Scanner(System.in);
        int A,B,C;

        System.out.print("Enter 1st Number A = ");
        A = quadratic.nextInt();

        System.out.print("Enter 2nd Number B = ");
        B = quadratic.nextInt();

        System.out.print("Enter 3rd Number C = ");
        C = quadratic.nextInt();

        long  D = (B*B) - (4*A*C);

        if(D>0)
        {
            double x1 = (-B + sqrt(D)) / (2 * A);

            double x2 = (-B - sqrt(D))/(2*A);

            System.out.println("x1 = "+x1+"  x2 = "+x2);
        }
        else if(D==0)
        {
            double x = (-B)/(2*A);
            System.out.println("X = "+x);
        }

        else
            System.out.println("No Real Soultion");

    }
}
