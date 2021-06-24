import java.util.logging.Level;
import java.util.logging.Logger;

// within same class Using this() keyword
class ConstructorAssignment {
    Logger logger= Logger.getLogger(ConstructorAssignment.class.getName());
    // default constructor 1
    // default constructor will call another constructor -> using this keyword from same class
    ConstructorAssignment()
    {
        // calls constructor 2 with one parameter
        this(5);
        logger.log(Level.INFO,"This is default constructor");
    }
    // parameterized constructor 2
    ConstructorAssignment(int x)
    {
        logger.log(Level.INFO,"Constructor called -> "+x);
    }
    public static void main(String[] args)
    {
        // invokes default constructor first
        // then default constructor -> parameterized constructor using this
        new ConstructorAssignment();
    }
}
