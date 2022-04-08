import java.util.Scanner;

public class DeleteArray {
    public static void main(String [] args)
    {
        Scanner Number = new Scanner(System.in);
        int N;
        System.out.print("Enter array number : ");
        N = Number.nextInt();

        int[] array = new int[N+2];
        for(int i=1; i<=N; i++)
        {
            array[i] = Number.nextInt();
        }
        int DelArry;
        DelArry = Number.nextInt();

        for(int i=DelArry; i<N; i++)
        {
            array[i] = array[i+1];
        }

        N = N-1;

        for(int i=1; i<=N; i++)
        {
            System.out.println(array[i]);
        }

    }
}
