class c1{
    public int x=10;//accessed everywhere
    private int y=30;//accessed only within defined class
    int z=20;//default can be accessed only within defined class and packages
    protected int d=60;//accessed class,subclasses and packages
    public void meth1(){
        System.out.println(x);
        System.out.println(y);
        System.out.println(z);
        System.out.println(d);
    }
}
public class Access_mod2{
    public static void main(String[] args){
       c1 c=new c1();
       c.meth1();
    }
}