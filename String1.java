
public class String1 {
    public static void main(String[] args) {
        String1 str=new String1();
        String newString="HELLO welcome TO automation CLASS";
        System.out.println("Original String is :"+newString);
        str.lowerString(newString);
        str.upperString(newString);
        str.lengths(newString);
        str.reverse(newString);
        str.splits(newString);

    }
public static void lowerString(String newString)
{
    String s1=newString.toLowerCase();
    System.out.println("String to Lower Case Conversion is  :"+" "+s1);
}
public static void upperString(String newString)
{
    String s2=newString.toUpperCase();
    System.out.println("String to Upper Case Conversion is  :"+" "+s2);
}
public static void lengths(String newString)
{
    int s3=newString.length();
    System.out.println("Length of String is : "+""+s3);
}
public static void reverse(String newString)
{
    StringBuffer s4=new StringBuffer(newString);
    System.out.println("Reversed String is : "+" "+s4.reverse());
}
public static void splits(String newString)
{
   String[] s6=newString.split(" ");
   for (String s: s6)
           System.out.println(s);
}
}
