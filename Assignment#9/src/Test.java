import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.Scanner;

public class Test
{
    public void Check(String s1) {
        //Hi I'm Dhanraj, currently doing intern as Associate Software Engineer in Zemoso Technologies. ->true
        //hi I'm Dhanraj, currently doing intern as Associate Software Engineer in Zemoso Technologies. ->false
        String regexPattern="[A-Z].*[.]";
        boolean flag=Pattern.matches(regexPattern, s1);
        if(flag){
            System.out.println("Yes the given pattern matches the regex: "+flag);
        }
        else{
            System.out.println("No the given pattern does not matches the regex: "+flag);
        }
    }

    public static void main(String[] args)
    {
        String s1;
        Scanner in = new Scanner(System.in);
        System.out.println(" Enter the string: ");
        s1 = in.nextLine();
        Test obj = new Test();
        obj.Check(s1);
    }
}