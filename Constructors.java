class Emp{
    private int id;
    private String name;
    public Emp(){
        id=12;
        name="sandip";
    }
     public Emp(int i,String x){
        id=i;
        name=x;
    }
    public void getter(){
        System.out.println("The id is:"+id);
        System.out.println("The name is:"+name);
    }
}
public class Constructors{
    public static void main(String[] args){
      Emp e=new Emp();
      e.getter();
      Emp e2=new Emp(32,"Diya");
      e2.getter();
    }
}