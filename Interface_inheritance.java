
interface sampleInterface{
  void meth1();
  void meth2();
}
interface childSampleInterface extends sampleInterface{
   void meth3();
   void meth4();
}
class mySampleClass implements childSampleInterface{
     public void meth1(){
        System.out.println("Meth1 method");
     }
     public void meth2(){
        System.out.println("Meth2 method");
     }
     public void meth3(){
        System.out.println("Meth3 method");
     }
     public void meth4(){
        System.out.println("Meth4 method");
     }
}
public class Interface_inheritance{
    public static void main(String[] args){
       mySampleClass mc=new mySampleClass();
       mc.meth1();
       mc.meth2();
       mc.meth3();
       mc.meth4();
    }
}