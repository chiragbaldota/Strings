public class StringCompareFunction {
    public static boolean compareString(String str1,String str2,String str3){

        if(str1.equals(str3))
        {
            return true;
        }
        else
        {
            return false;
        }
    }

    public static void main(String args[]){
        String str1 = "chirag";
        String str2 = "chirag";
        String str3 = new String("chirag");

        System.out.println(compareString(str1,str2,str3));

    }
}
