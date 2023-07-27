import java.util.*;

public class Str {
    public static void printLetter(String str){
        for(int i=0;i<str.length();i++){
            System.out.println(str.charAt(i) + " ");
        }
        System.out.println();
    }

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();

        System.out.println(str);

           String fullName = "chirag baldota";
           System.out.println(fullName.length());

        //concatenation
        String firstname = "salman";
        String lastname = "khan";

        String fullNames = firstname + " " + lastname;
        System.out.println(fullNames.charAt(0));




    }
}
