package CallByReferenceMethod;

public class CallByReferenceTest
{
    public static void main(String [] args){
        CallByReference r1 = new CallByReference();

        r1.name = "Anis";

        System.out.println("before calling : "+r1.name);

        r1.change(r1);

        System.out.println("after calling : "+r1.name);

    }

}