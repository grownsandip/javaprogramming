/* abstract classes are basically blue print for other concrete classes creation
 and hence objects of abstract classes cannot be formed. The classes extending abstract classes override the abstract methods of abstract classes */
abstract class parent2{
    //class having atleast one abstract method is called abstract class
    public parent2(){
        System.out.println("Parent2 class constructor");
    }
    public void sayHello(){
        System.out.println("Hello");
    }
    abstract public void greet();//abstract method declared but never defined
    abstract public void kickMe();
}
class child2 extends parent2{
    @Override
    public void greet(){
        System.out.println("greetings from child2 class");
    }
    @Override
    public void kickMe(){
        System.out.println("we have been kicked.");
    }
}
public class Abstracts{
    public static void main(String[] args){
     // parent2 p=new parent2(); this is not allowed
     child2 c2=new child2();//this is one way
     parent2 p=new child2();//this is also allowed as per dynamic dispatch
    //  c2.sayHello();
    //  c2.greet();
    //  c2.kickMe();
     p.sayHello();
     p.greet();
     p.kickMe();
    }
}