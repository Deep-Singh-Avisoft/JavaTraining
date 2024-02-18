import java.util.Scanner;

public class remChars {
    static String remove(String str, char X){
        String ans = "";
        for(int i = 0; i < str.length(); i++){
            if(str.charAt(i) != X){
                ans += str.charAt(i);
            }
        }
        return ans;
    }
    public static void main(String[] args){
        Scanner obj = new Scanner(System.in);
        System.out.print("Enter Input String : ");
        String str = obj.nextLine();
        System.out.print("Enter Character to remove : ");
        char X = obj.next().charAt(0);
        System.out.print("String after removing character : " + remove(str, X));
    }
}
