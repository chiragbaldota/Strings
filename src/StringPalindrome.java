import java.util.Scanner;

public class StringPalindrome {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter string to check string is palindrome or not");
        String str = sc.nextLine();
        int len = str.length();
        String rev = "";
        String temp =str;

        for(int i=len - 1;i>=0;i--)
        {
            rev = rev + str.charAt(i);
        }

        if(rev.equals(temp))
        {
            System.out.println("string is palindrome");
        }
        else
        {
            System.out.println("string is not palindrome");
        }
    }
}
