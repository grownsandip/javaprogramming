class A{
   public void m1(){
     System.out.println("I am a method1 of class A");
   }
   public void m2(){
     System.out.println("I am a method2 of class A");
   }
}
class B extends A{
  @Override
  public void m2(){
     System.out.println("I am a method2 of class B");
  }
  public void m3(){
    System.out.println("I am a method3 of class B");
  }
}
public class Method_overriding{
    public static void main(String[] args){
       A a=new A();
       a.m2();
       B b=new B();
       b.m2();
    }
}