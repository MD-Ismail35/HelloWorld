
     // MD. Ismail
     // ID-> C211035
package Encapsulation;

import javax.swing.plaf.synth.SynthLookAndFeel;
import java.util.Scanner;

public class Driver {
    public static void main(String [] args)
    {
        Scanner number = new Scanner(System.in);

        Student obj = new Student("Ismail",211035,"IIUC");

        System.out.print("Enter New Name Plz : ");
        String name = number.nextLine();

        System.out.print("Enter New Id Plz : ");
        int a = number.nextInt();

        number.nextLine();
        System.out.print("Enter New University Name Plz : ");
        String UniName = number.nextLine();


        obj.setAll(name,a,UniName);


        System.out.println("\nYour Name is : "+obj.getName());

        System.out.println("your Id is : "+obj.getId());

        System.out.println("Your University Name is "+obj.getUniversityName());



    }
}
