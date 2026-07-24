
class th extends Thread{
    public th(String name){
        super(name);
    }
    @Override
    public void run(){
        int i=0;
        System.out.println("Thank you");
        // while(i<10000){
        //     System.out.println("Hello i am a thread");
        //     i++;
        // }
    }
}
public class Thread_constructors{
    public static void main(String[] args){
       th t=new th("Sandip");
       th t1=new th("Liza");
       t.start();
       t1.start();
       System.out.println("The id of this thread is:"+t.getId());
       System.out.println("The name of this thread is:"+t.getName());
       System.out.println("The id of this thread is:"+t1.getId());
       System.out.println("The name of this thread is:"+t1.getName());
    }
}