import java.lang.Exception;

class UserName extends Exception{
    public UserName(String str){
        super(str);
    }
};

class Id extends Exception{
    public Id(String str){
        super(str);
    }
};

class Dept extends Exception{
    public Dept(String str){
        super(str);
    }
};

public class Assignment {
    public void Auth(String uname,String id,String dept) throws UserName,Id,Dept{
        if(uname.length()<=4){
            throw new UserName("username is very short!");
        }
        else if(uname.length()>=15){
            throw new UserName("username is too long!");
        }
        if(id.length()!=7){
            throw new Id("Invalid id!");
        }
        if(dept!="Zemoso"){
            throw new Dept("Unkown user!");
        }
    }

}
