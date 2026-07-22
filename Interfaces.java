/*interfaces are used for grouping some related abstract methods.There are only abstract methods in the interface  allowed */
interface BiCycle{
    //int x=45; this property is final and cannot be modified
    void applyBrake(int decrement);
    void speedUp(int increment);
}
interface Horn{
    void blowHorn(int x);
    void startSong(int s);
}
class AvonCycles implements BiCycle,Horn{
    public void applyBrake(int decrement){
        System.out.println("The speed has decreased by"+decrement);
    }
    public void speedUp(int increment){
        System.out.println("The speed has increased by"+increment);
    }
     public void blowHorn(int x){
        System.out.println("The horn has been blown"+x);
    }
    public void startSong(int s){
        System.out.println("The song has started"+s);
    }
}

public class Interfaces{
    public static void main(String[] args){
        AvonCycles myCycle = new AvonCycles();
        myCycle.applyBrake(10);
        myCycle.speedUp(20);
        myCycle.blowHorn(10);
        myCycle.startSong(20);
    }
}