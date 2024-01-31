import java.util.Scanner;

public class allSubstrings {
    static void generateSubstr(String str){
        for(int i = 0; i < str.length(); i++){
            String s = "";
            for(int j = i ; j < str.length(); j++){
                s += str.charAt(j);
                System.out.println(s);
            }
        }
    }
    public static void main(String[] args){
        Scanner obj = new Scanner(System.in);
        System.out.print("Enter Input String : ");
        String str = obj.nextLine();
        generateSubstr(str);

    }
}
