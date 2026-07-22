/*interfaces in java can be used with polymorphism */
interface myWifi{
   String [] networkList();
   void connectToNet(String network);
}
interface myCamera{
    void takeSnap();
    void recordVideo();
}
class myCellPhone{
    void callNumber(int num){System.out.println("Calling number:"+num);}
    void pickCall(){System.out.println("Picking call....");}
}
class mySmartPhone extends myCellPhone implements myWifi,myCamera{
    public void takeSnap(){System.out.println("Taking snap");}
    public void recordVideo(){System.out.println("recording video..");}
    public String [] networkList(){
        System.out.println("Setting list of networks");
        String[] netList={"pulak","neha","santanu"};
        return netList;
    }
    public void connectToNet(String network){
      System.out.println("Connecting to"+network);
    }
}
public class Interface_poly{
    public static void main(String[] args){
       myCamera cam1= new mySmartPhone();
       //cam1.networkList();//-> not allowed
       cam1.recordVideo();
       mySmartPhone ms=new mySmartPhone();//we can call all methods
       ms.callNumber(859);
       ms.pickCall();
       ms.takeSnap();
       ms.recordVideo();
       ms.connectToNet("seema");
       myCellPhone cp=new myCellPhone();
       cp.pickCall();
    }
} 