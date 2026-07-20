public class Varargs{
    //rather than creating multiple method overloads
    static int sum(int ...arr){
        //available as int [] arr
        //to ensure there is atleast one element sum(int x,int ..arr)
        int sum=0;
        for(int e:arr){
            sum+=e;
        }
        return sum;
    }
    public static void main(String[] args){
       System.out.println(sum(2,3,4,5,6,7));
    }
}