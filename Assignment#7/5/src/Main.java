class One{
    /*static*/ class Two{
        int a;
        Two(int a){
            this.a=a;
            System.out.println(a);
        }
    }
}
class Three{
    //Err! -> This is not possible bcz Two is not accessed outside One
    //We can allow this by defining method as static
    class Four extends One.Two {
        Four(){
            super(6);
        }

    }
}
public class Main {
    public static void main(String[] args){
        Three.Four obj=new Three().new Four();
    }
}
