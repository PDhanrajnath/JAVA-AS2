abstract class Cycle{
    public abstract void balance();
}
class Unicycle extends Cycle{
    public void balance(){
        System.out.println("The cost of Unicycle start with RS 2500. ");
    }
}
class Bicycle extends Cycle{
    public void balance(){
        System.out.println("The cost of Bicycle start with Rs 3000. ");
    }
}
class Tricycle extends Cycle{
//    public void balance() {
//
//    }
//getting error in this code as Tricycle class inherit class Cycle but balance() is not declare by this class
}
public class Two{
    public static void main(String[] args) {
//        Unicycle u=new Unicycle();
//        u.balance();
//        Bicycle b=new Bicycle();
//        b.balance();
//        Tricycle t=new Tricycle();
//        t.balance();

        //java: Tricycle is not abstract and does not override abstract method balance() in Cycle


//        Cycle[] obj = new Cycle[3];
//        obj[0] = new Unicycle();
//        obj[0].balance();
//        obj[1] = new Bicycle();
//        obj[1].balance();
//        obj[2] = new Tricycle();
//        obj[2].balance();
        //java: Tricycle is not abstract and does not override abstract method balance() in Cycle

    }
}