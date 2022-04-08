import java.util.Scanner;

public class StrdentPass {
    public static void main(String [] args)
    {
        Scanner number = new Scanner(System.in);
        int N;
        System.out.print("Enter how many array Number : ");
        N = number.nextInt();

        int[] array = new int[N+2];

        for(int i=1; i<=N; i++)
            array[i] = number.nextInt();

        int count = 0;

        for(int i=1; i<=N; i++)
        {
            if(array[i]>=40)
                count++;
        }

        System.out.println("Total Student Passes Number = "+count);


    }
}
