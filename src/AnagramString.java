public class AnagramString {

    public static boolean isAnagram(String p, String q){
               int a = p.length();
               int b = q.length();

               if(a!=b)
               {
                   return false;
               }
               else
               {
                   int count[] = new int[26];
                   for(int i=0;i<a;i++)
                   {
                       count[p.charAt(i)-'a']++;
                   }

                   for(int i=0;i<b;i++)
                   {
                       count[q.charAt(i)-'a']--;
                   }

                   for(int i=0;i<count.length;i++)
                   {
                       if(count[i]!=0)
                       {
                           return false;
                       }
                   }
               }

               return true;

    }

    public static void main(String args[]){
               String p = "anagram";
               String q = "nagaram";

               System.out.println(isAnagram(p,q));

    }
}
