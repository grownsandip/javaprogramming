class myThread1 implements Runnable{
    @Override
    public void run(){
      int i=0;
      while(i<1000){
        System.out.println("Thread1 is running..");
        i++;
      }
    }
}
class myThread2 implements Runnable{
    @Override
    public void run(){
      int i=0;
      while(i<1000){
        System.out.println("Thread2 is running..");
        i++;
      }
    }
}

public class Thread_runnable{
    public static void main(String[] args){
       myThread1 bullet1=new myThread1();
       Thread gun1=new Thread(bullet1);
       myThread2 bullet2=new myThread2();
       Thread gun2=new Thread(bullet2);
       gun1.start();
       gun2.start();
    }   
}