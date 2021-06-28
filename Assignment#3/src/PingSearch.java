import java.io.*;
import java.util.*;
public class PingSearch {

    public static void runSystemCommand(String command) {
        //ArrayList to store the time taken for each ping
        ArrayList<Double> al=new ArrayList<>();
        try {
            //Runtime class used to execute given command
            Process p = Runtime.getRuntime().exec(command);
            BufferedReader inputStream = new BufferedReader(new InputStreamReader(p.getInputStream()));
            String sub_s="";
            String s = "";
            int i=0;
            // reading output stream of the command
            while ((s =inputStream.readLine())!= null) {
                //searching the time in each line
                if(s.indexOf("time=")!=-1) {
                    //index of time
                    i = s.indexOf("time=");
                    //time is added to sub_s
                    sub_s = s.substring(i + 5, i + 9);
                    // converting string to double data type
                    // adding time into arraylist
                    al.add(Double.parseDouble(sub_s));
                }
                System.out.println(s);

            }
            //sorting the arraylist
            Collections.sort(al);
            System.out.print("Ping Times : "+al+"\n");
            //calculate median i.e., mid value of times
            System.out.println("Median time for ping --> "+al.get(al.size()/2));

        }
        //Exceptions are caught here!
        catch (Exception e) {
            e.printStackTrace();
        }
    }
    public static void main(String[] args) {

        String ip;
        int times;
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the ip address : ");
        ip =in.nextLine();
        System.out.println("Enter number of times you want to ping : ");
        times=in.nextInt();
        //passing command
        runSystemCommand("ping " + ip +" -c "+ times);

    }
}