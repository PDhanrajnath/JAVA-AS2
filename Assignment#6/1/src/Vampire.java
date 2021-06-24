import java.util.*;

public class Vampire {
    public static void main(String[] args) {
        String[] str1, str2;
        int pro,sum=0,count=100,c=0;
        while(count!=0) {
            c++;
            for (int i = 10; i < 100; i++) {
                for (int j = i; j < 100; j++) {
                    pro = i * j;
                    int lengthi = String.valueOf(i).length();
                    int lengthj = String.valueOf(j).length();
                    // Exclude numbers less than 1000 and greater than 999999
                    if (lengthi != lengthj)
                        continue;
                    // Convert the product and multiplier to a string array
                    str1 = String.valueOf(pro).split("");
                    str2 = (String.valueOf(i) + String.valueOf(j)).split("");
                    // Sort the string array
                    Arrays.sort(str1);
                    Arrays.sort(str2);
                    // Compare two arrays
                    if (Arrays.equals(str1, str2)) {
                        sum++;
                        System.out.println( i + "*" + j + "=" + pro);
                    }
                }
            }
            count--;
        }
    System.out.println("Vampire numbers count ---> "+c);
    }

}