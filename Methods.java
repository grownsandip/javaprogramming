public class Methods{
    //static key word attaches methods to classes rather than objects
    // static  int f(int x,int y){
    //     return x+y;
    // }
      int f(int x,int y){
        return x+y;
      }
    public static void main(String[] args){
        int a=10;
        int b=20;
        // int sum=f(a,b);
        // non static methods we have to use objects of class to call methods
        Methods obj=new Methods();
        int sum=obj.f(a,b);//every obj will have method instance associated with it
        System.out.println(sum);
    }
}