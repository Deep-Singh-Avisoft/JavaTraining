import java.util.Scanner;

public class remAdjdup {

    //function to remove adjacent duplicates
    public String remove(String str){
        StringBuilder sb = new StringBuilder(str);

        for(int j = 0; j < str.length() - 1; j++){
            if(str.charAt(j) == str.charAt(j+1)){
                return remove(str.substring(0,j) + str.substring(j+2));
            }
        }
        return sb.toString();
    }
    public static void main(String[] args){
        //defining an object of scanner
        // class in order to take input from user
        Scanner obj = new Scanner(System.in);

        System.out.print("Enter Input String : ");
        String str = obj.nextLine();

        //object of class remAdjdup
        remAdjdup o = new remAdjdup();

        System.out.print("String after removing adjacent duplicates : " + o.remove(str));
    }
}
