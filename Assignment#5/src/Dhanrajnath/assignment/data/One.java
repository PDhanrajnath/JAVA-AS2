package Dhanrajnath.assignment.data;

public class One {
    public int a;
    char b ;
    public void display(){
        System.out.println("int -> "+a);
        System.out.println("char -> "+b );
    }
    public void show(){
        //without the initialization of local variable print their values in not possible.
//        int c=5;
//        char d='k';
        int c;
        char d;
        System.out.println("int -> "+c);
        System.out.println("char -> "+d);
    }
}
