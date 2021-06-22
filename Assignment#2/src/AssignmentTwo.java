import java.io.*;
import java.util.*;

public class AssignmentTwo {
    public static boolean checkAssignment(String sentenceEnteredByUser){
        //bool array to check aplhabet is visited or not!
        boolean[] visited=new boolean[26];
        for (int i=0;i<sentenceEnteredByUser.length();i++){
            //lowercase
            if('a'<=sentenceEnteredByUser.charAt(i) && sentenceEnteredByUser.charAt(i)<='z'){
                i=sentenceEnteredByUser.charAt(i)-'a';
            }
            //uppercase
            else if('A'<=sentenceEnteredByUser.charAt(i) && sentenceEnteredByUser.charAt(i)<='Z'){
                i=sentenceEnteredByUser.charAt(i)-'A';
            }
            //visiting alphabet is set into true
            visited[i]=true;
        }
        for(int i=0;i<sentenceEnteredByUser.length();i++) {
            //checking if any one of them not visited atleast once then returning false
            if (!visited[i]) {
                return false;
            }
        }
        //If all alphabet letters visited it return true
                return true;
    }
    public  static  void  main (String args[]){
        //Scanner class for user input
        Scanner sc=new Scanner(System.in);
        //Displaying user to enter string
        System.out.println("Enter String");
        //entered string is stored in str by Scanner class object
        String str=sc.next();
        //CAlling function call checkAssignment and return true/false
        if(checkAssignment(str)){
            System.out.println("TRUE");
        }
        else{
            System.out.println("FALSE");
        }
    }
}
// Complexity --> O(n)