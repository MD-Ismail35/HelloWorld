
    // MD. Ismail
    // ID-> C211035
package Encapsulation;

public class Student {
    private String Name;
    private int Id;
    private String UniversityName;
     Student(String Name, int Id, String UniversityName)
     {
         this.Name = Name;
         this.Id = Id;
         this.UniversityName = UniversityName;
     }
     public void setAll(String N, int I, String U)
     {
         Name = N;
         Id = I;
         UniversityName = U;
     }


     public String  getName()
     {
         return Name;
     }
     public int getId()
     {
         return Id;
     }
    public String  getUniversityName()
    {
        return UniversityName;
    }

}
