
class myThread1 extends Thread{
    @Override
    public void run(){
      int i=0;
      while(i<1000){
        System.out.println("Thread1 is running..");
        i++;
      }
    }
}
class myThread2 extends Thread{
    @Override
    public void run(){
      int i=0;
      while(i<1000){
        System.out.println("Thread2 is running..");
        i++;
      }
    }
}

public class Thread_class{
    public static void main(String[] args){
      myThread1 t1=new myThread1();
      myThread2 t2=new myThread2();
      t1.start();
      t2.start();
    }
}