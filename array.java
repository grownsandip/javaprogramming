import java.util.Scanner;
public class array{
    public static void main(String[] args){
        //int [] marks=new int [5]; //name is pointer to array object LHS declaration RHS is mem allocation
        // int [] marks={10,20,30,40,50};//another way to declare arrays in java
        // System.out.println(marks.length);
        // for(int x:marks){
        //      System.out.println(x);
        // }
        //multidimensional arrays
        int [][] flats;
        flats=new int [2][3];
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter elemnts in the array:");
        for(int i=0;i<2;i++){
            for(int j=0;j<3;j++){
                flats[i][j]=sc.nextInt();
            }
        }
        for(int i=0;i<2;i++){
            for(int j=0;j<3;j++){
                 System.out.println(flats[i][j]+",");
            }
        }

    }
}