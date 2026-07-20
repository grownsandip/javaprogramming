//There can be only one public class in java file
class Employee{
    int id;//attributes
    String name;//attributes
    public void details(){
        //methods of objects
      System.out.println("Employee id is:"+id);
      System.out.println("Employee name is:"+name);
    }
}
public class custom_class{
    public static void main(String[] args){
    Employee e=new Employee();
    e.id=12;
    e.name="Sandip";
    e.details();
    }
}