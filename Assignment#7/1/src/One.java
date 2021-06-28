abstract class Rodent{
    Rodent(){
        System.out.println("Constructor of Rodent is running.");
    }
    public abstract void game();
    public abstract void display();

}
class Mouse extends Rodent{
    //inheriting and overriding methods of parent class
    Mouse(){
        //constructor
        System.out.println("Constructor of Mouse is running.");
    }
    public void game(){

        System.out.println("Mouse is playing with ball.");
    }
    public void display(){

        System.out.println("I am Mouse... ");
    }
}
class Gerbil extends Rodent{
    //inheriting and overriding methods of parent class
    Gerbil(){
        //constructor

        System.out.println("Constructor of Gerbil is running");
    }
    public void game(){
        System.out.println("Gerbil is playing...");
    }
    public void display(){
        System.out.println("I am Gerbil... ");
    }
}
class Hamster extends Rodent{
    //inheriting and overriding methods of parent class
    Hamster(){
        //constructor

        System.out.println("Constructor of Hamster is running");
    }
    public void game(){

        System.out.println("Hamster is playing with mouse");
    }
    public void display(){
        System.out.println("I am Hamster... ");
    }
}
public class One {
    public static void main(String[] args) {
        //array of instances
        Rodent[] rodent = new Rodent[3];
        rodent[0] = new Mouse();
        rodent[0].display();
        rodent[0].game();
        rodent[1] = new Gerbil();
        rodent[1].display();
        rodent[1].game();
        rodent[2] = new Hamster();
        rodent[2].display();
        rodent[2].game();
    }
}