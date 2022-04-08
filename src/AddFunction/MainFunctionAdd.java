package AddFunction;

import java.util.Scanner;

public class MainFunctionAdd {

        public static void main(String[] args)
        {
            Scanner Number = new Scanner(System.in);
            int a,b;
            System.out.print("Enter 1st Number : ");
            a = Number.nextInt();

            System.out.print("Enter 2nd Number : ");
            b = Number.nextInt();

            Calculator sum = new Calculator();

            int result = sum.add(a,b);

           System.out.println("Total Sum = "+result); //C211035

       }

    }

