
import java.io.File;
import java.util.Scanner;


public class SearchFile{

    private void findFile()
    {

        // address of files or folder where to search
        File file = new File("/home/dhanrp/");
        //string to store the name of the file
        String str ;
        //  Scanner is declare
        Scanner in = new Scanner(System.in);
        // do while is used to run the program again and again
        do{
            int ab =0;
            System.out.println("ENTER THE NAME OF FILE OR FOLDER");
            //take input
            str =in.nextLine();
            if(str=="quit"){
                return ;
            }
            //list of file is stored in string
            String[] files = file.list();
            //continous check each file or folder
            for (String string : files){
                //check the name of file present or not and store in boolean str1
                Boolean str1 = str.equals(string);
                // str1 is true than print the following
                if (str1){
                    ab = 1;
                    System.out.println("File Found : "+string);
//                    System.out.println(string);
                    //print the address of the fiMle
                    System.out.println("Path : "+ file.getAbsolutePath());
                }
            }
            //if file not found
            if(ab == 0)
            {
                System.out.println("File not find : Reenter the name of the file.");
            }
        } while(true);
    }

    public static void main(String[] args){
        //object of SearchFile class is created
        SearchFile obj =new SearchFile();
        //calling the findFile()
        obj.findFile();
    }
}