class phone{
   public void greet(){
     System.out.println("WELCOME PHONE");
   }
   public void on(){
    System.out.println("PHONE IS ON");
   }
}
class smartPhone extends phone{
   public void swagat(){
     System.out.println("WELCOME SMARTPHONE");
   }
   public void on(){
    System.out.println("SMARTPHONE IS ON");
   }
}
public class Dynamic_dispatch{
    public static void main(String[] args){
        //phone obj=new phone();
       // phone obj=new smartPhone(); // allowed
        //smartPhone obj=new phone(); // not allowed
        smartPhone obj=new smartPhone(); // allowed
       // phone obj; //this is invalid as object variables are pointers in java
        obj.on(); // on function is called based on runtime object type
        //obj.swagat();// throws error as this method is of subclass and not overriden
        obj.greet();// this works as it is a method of superclass
    }
}