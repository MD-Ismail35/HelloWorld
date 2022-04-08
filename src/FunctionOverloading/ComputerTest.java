
       //MD.Ismail.
       //ID-> C211035

package FunctionOverloading;

public class ComputerTest {
    public static void main(String[] args)
    {
        Computer obj = new Computer();

        int A =  obj.Add(4,6);
        System.out.println("Sumation of int Numbers = "+A);

        double sum = obj.Add(7.5,13.876,7);
        System.out.println("Sumation of double number = "+sum);


        String name = obj.Add("C211035","Ismail");

        System.out.println("Sumation of two string = "+name);

        obj.Add(5,3.5f);


      }
}
