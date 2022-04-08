import java.util.Scanner;

public class LargestNumber {
    public static void main(String [] args)
    {
        Scanner number = new Scanner(System.in);

        int N;
        System.out.print("Enter Number : ");
        N = number.nextInt();

        int[] array = new int[N+5];

        for(int i=1; i<=N; i++)
            array[i] = number.nextInt();

        int Max = array[1];
        for(int i=2; i<=N; i++)
        {
            if(Max<array[i])
            {
                Max = array[i];
            }
        }
      System.out.printf("Maximum Number %d",Max);

    }

}
