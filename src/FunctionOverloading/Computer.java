
   //MD.Ismail.
   //ID-> C211035
package FunctionOverloading;

public class Computer {

    int Add(int a, int b)
    {
        return a+b;
    }
    void Add(int c, float d)
    {
        System.out.println(c+d);
    }

    double Add(double a, double b,double c)
    {
        return  a+b+c;
    }
    String Add(String a, String b)
    {
        return a+b;
    }


}
