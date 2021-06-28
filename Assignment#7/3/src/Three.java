import java.util.Scanner;
interface A{
    void showLogA();
    void displayA();
}
interface B{
    void showLogB();
    void displayB();
}
interface C {
    void showLogC();
    void displayC();

}
//inherting 3 diff interfaces here
interface D extends A,B,C{
    void newMethod();
}

class ConcreteClass implements D{
    public void showLogA(){
        System.out.println("interface A showLog method");
    }
    public void displayA(){
        System.out.println("interface A display method");
    }
    public void showLogB(){
        System.out.println("interface B showLog method");
    }
    public void displayB(){
        System.out.println("interface B display method");
    }
    public void showLogC(){
        System.out.println("interface C showLog method");
    }
    public void displayC() {
        System.out.println("interface C display method");
    }
//methods that takes parameters as objects
    public void newMethod() {
        System.out.println("New Method! from D which extends all three interfaces");
    }
    static void showMethodsA(A a){
        a.displayA();
        a.showLogA();
    }
    static void showMethodsB(B b){
        b.displayB();
        b.showLogB();
    }
    static void showMethodsC(C c){
        c.displayC();
        c.showLogC();
    }
    static void showMethodsD(D d){
        d.newMethod();
    }

}

class Three {


    public static void main(String[] args) {
        ConcreteClass obj=new ConcreteClass();

        obj.showMethodsA(obj);
        obj.showMethodsB(obj);
        obj.showMethodsC(obj);
        obj.showMethodsD(obj);

    }
}