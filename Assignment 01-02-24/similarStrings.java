import java.util.Scanner;

public class similarStrings {

    static boolean similar(String str1, String str2){
        if(str1.equals(str2)){
            return true;
        }
        if(str1.length() % 2 != 0 || str2.length() % 2 != 0){
            return false;
        }

        int n = str1.length();
        String A1 = str1.substring(0, n/2);
        String A2 = str1.substring(n/2);
        String B1 = str2.substring(0, n/2);
        String B2 = str2.substring(n/2);

        return  ((similar(A1,B1) && similar(A2,B2)) || (similar(A1, B2) && similar(A2, B1)));
    }

    public static void main(String[] args){
        Scanner obj = new Scanner(System.in);
        System.out.print("Enter String A : ");
        String A = obj.nextLine();
        System.out.print("Enter String B : ");
        String B = obj.nextLine();

        System.out.print("Strings are equal : " + similar(A, B));
    }
}
