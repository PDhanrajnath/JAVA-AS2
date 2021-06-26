import Dhanrajnath.assignment.data.One;
import Dhanrajnath.assignment.data.Two;

public class Main{

    public static void main(String[] args) {
        One obj =new One();
        //global variables which can get default values.
        obj.display();
        //local variables which are not initialized but does not get any default values.
        obj.show();
        //static methods can only access static variables.
        Two obj1 = new Two("str");
        obj1.twoMethod("str");
        obj1.print();

    }

}