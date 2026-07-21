class base{
   base(){
    System.out.println("I am a constructor of base class");
   }
   base(int x){
    System.out.println("I am an overloaded constructor of base class"+x);
   }
}
class derived extends base{
   derived(){
    System.out.println("I am a constructor of derived class");
   }
   derived(int x,int y){
    super(x);// parent class parameterized constructor call
    System.out.println("I am a overloaded constructor of derived class "+y);
   }
}
class childDerived extends derived{
   childDerived(){
    System.out.println("I am a constructor of child derived class");
   }
   childDerived(int x,int y,int z){
    super(x,y);// immediate parent class parameterized constructor call
    System.out.println("I am a overloaded constructor of child derived class "+z);
   }
}
public class Constructors_in_inheritance{
    public static void main(String[] args){
      //base b=new base();
      //derived d=new derived(10,20);
      //childDerived cd=new childDerived();
      childDerived cd=new childDerived(12,23,45);
    }
}