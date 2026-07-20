
class MyEmp{
    private int id;
    private String name;
    //we need member methods here getter and setter to access private members
    public void setter(int n,String x){
        id=n;
        name=x;
    }
    public void getter(){
        System.out.println("The id is:"+id);
        System.out.println("The name is:"+name);
    }
}
public class Access_modifiers{
    public static void main(String[] args){
      MyEmp e=new MyEmp();
      e.setter(12,"Sandip");
      e.getter();
    }
}