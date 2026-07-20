public class Method_overloading{
    //methods cannot be overloaded by changing the return type only changing parameters
    static void foo(){
     System.out.println("good morning");
    }
    static void foo(int x){
     System.out.println("good morning"+x);
    }
    static void foo(int x,int y){
     System.out.println("good morning"+(x+y));
    }
    public static void main(String[] args){
        foo();
        foo(2000);
        foo(2000,3000);
    }
}