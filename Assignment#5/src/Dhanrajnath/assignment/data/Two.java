package Dhanrajnath.assignment.data;

public class Two{
    String str;
    public Two(String otherStr){
        str=otherStr;
    }

    public Two twoMethod(String s) {
        //static methods can only access static variables;
        str=s;
        Two sc = new Two(s);
        return sc;
    }
    public void print() {
        System.out.println(str);
    }

    public static void main(String[] args)
    {
        String str = "ABCD";
        Two obj = new Two(str);
        obj.twoMethod(str);
        obj.print();
    }

}