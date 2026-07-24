import java.util.Scanner;
public class Errors{
    public static void main(String[] args){
        // a=5;//syntax error
        //int b=9;
        //system.out.println(a+b);
        //LOGICAL ERROR
        for(int i=1;i<9;i++){
            System.out.println(2*i+1);
        }
        //RUNTIME ERROR
        int k;
        Scanner s=new Scanner(System.in);
        k=sc.nextInt();
        System.out.println("The result of 1000 divided by k is:"+1000/k);
    }
}