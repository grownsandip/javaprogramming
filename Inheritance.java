class Base{//also known as super class or parent class
    int x;
    public void setX(int x){
        this.x=x;
    }
    public int getX(){
        return x;
    }
}
class Derived extends Base{
    // also known as subclass or child class
    int y;
    public void setY(int y){
        this.y=y;
    }
    public int getY(){
        return y;
    }
}
public class Inheritance{
    public static void main(String[] args){
       //base class object
       Base b=new Base();
       b.setX(10);
       //b.setY(20); base class object cannot access derived class objects
       System.out.println(b.getX());
       //derived class object
       Derived d= new Derived();
       d.setX(30);
       d.setY(20);
       System.out.println(d.getX());
       System.out.println(d.getY());
    }
}