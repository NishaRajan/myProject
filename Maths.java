public class Maths {
    public static void main(String[] args) {
         Maths a=new  Maths();
         int b=8;
         int c=4;
         int e=a.add(b,c);
         int f=a.sub(b,c);
         int g=a.mul(b,c);
         int h=a.divi(b,c);
        System.out.println("The result of addition is = "+e);
        System.out.println("The result of subtraction is = "+f);
        System.out.println("The result of multiplication is = "+g);
        System.out.println("The result of division is = "+h);
    }
    public int add(int b,int c)
    {
        int d=b+c;
        return d;
    }
    public int sub(int b,int c)
    {
        int d=b-c;
        return d;
    }
    public int mul(int b,int c)
    {
        int d=b*c;
        return d;
    }
    public int divi(int b,int c)
    {
        int d=b/c;
        return d;
    }
}
