import java.util.Scanner;

public class User_input{
    public static void main(String[] args){
       System.out.println("Taking input from user");
       Scanner sc=new Scanner(System.in);
       System.out.println("Enter input 1");
       int n1=sc.nextInt();
       System.out.println("Enter input 2");
       int n2=sc.nextInt();
       int sum=n1+n2;
       String sentence=sc.nextLine();
       System.out.println(sentence);
       System.out.println("The required sum of numbers are:"+sum);
    }
}