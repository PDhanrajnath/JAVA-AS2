//import edu.duke.FileResource;
import java.io.File;
import java.nio.file.FileSystems;
import java.nio.file.Path;
import java.nio.file.PathMatcher;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class SearchFile{
    private void findFile()
    {
        //default path
        File myObj = new File("/home/dhanrp/");
        //list of files in path
        String[] files=myObj.list();
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter pattern or regex! ");
        //regex pattern
        String reg=sc.nextLine();


//        if(flag){
//            System.out.println("Yes the given pattern matches the regex: "+flag);
//        }
//        else{
//            System.out.println("No the given pattern does not matches the regex: "+flag);
//        }


        //Pattern class compiles the regex
        Pattern pattern = Pattern.compile(reg, Pattern.CASE_INSENSITIVE);
        for(String s: files){
            //Matcher class will match the pattern to list of files
//            Matcher matcher = pattern.matcher(s);
            //matchFound will have the result
            boolean flag=Pattern.matches(reg, s);
            if(flag)
                System.out.println("Matched -> /home/dhanrp/"+s+"/");
            else
                System.out.println(s+" Not matched!");
        }

    }

    public static void main(String[] args){
        //object of SearchFile class is created
        SearchFile obj =new SearchFile();
        //calling the findFile()

        obj.findFile();
    }
}