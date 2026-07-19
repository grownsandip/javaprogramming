//strings are immutable in java

public class string_methods{
    public static void main(String[] args){
      String name="  hello my name is sandip  ";//pointer to an array of characters
      String up=name.toUpperCase();
      System.out.println(name.length());
      System.out.println(up);
      System.out.println(name.trim());//remove trailing and leading spaces
      System.out.println(name.substring(2,10));//start index included but end is excluded
      System.out.println(name.replace('a','r'));//replaces all occurances of a with r can used for replacing substring also
      System.out.println(name.charAt(9));//returns character present at given index
      System.out.println(name.indexOf('a',3));//returns the first occurance index of given character and start from index 3 ignore all occurances before it. If no match found returns -1
      System.out.println(name.equals("sandip"));//returns true if values of two stringsa rea equal

    }
}