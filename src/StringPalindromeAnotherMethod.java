import java.util.Scanner;

public class StringPalindromeAnotherMethod {
    public static boolean checkPalindrome(String str){

        for(int i=0;i<str.length()/2;i++)
        {
            int n = str.length();
            if(str.charAt(i) != str.charAt(n-1-i))
            {
                return false;
            }

        }

        return true;
    }

    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter string to check palindrome or not: ");
        String str = sc.nextLine();
        System.out.println(checkPalindrome(str));

    }
}
