import java.util.Scanner;

public class InsertArray {
    public static void main(String [] args)
    {
        Scanner number = new Scanner(System.in);
        int N;
        System.out.print("Enter array Number : ");
        N = number.nextInt();

        int[] array = new  int[N+2];

        for(int i=1; i<=N; i++)
        {
            array[i] = number.nextInt();
        }
        int Inarray,Innumber;
        System.out.print("Enter array number : ");
        Inarray = number.nextInt();

        System.out.print("Enter Inserting Number : ");
        Innumber = number.nextInt();

        for(int i=N; i>=Inarray; i--)
        {
            array[i+1] = array[i];
        }
        array[Inarray] = Innumber;

        N = N+1;

        for(int i=1; i<=N; i++)
        {
            System.out.println(array[i]);
        }
    }
}
