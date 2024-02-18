import java.util.ArrayList;
import java.util.Scanner;

public class wordBreak {
    //function to check whether string can be divided or not
    static boolean divided(String str, ArrayList<String> wordList){
        //base case if str is empty return true
        if(str.isEmpty()){
            return true;
        }

//        consider each possible substring of the given string
        for(int i = 1; i <= str.length(); i++){
            if(wordList.contains(str.substring(0,i))
                    //recursive call for remainig substring
                && divided(str.substring(i), wordList)){
                return true;
            }
        }
        return false;
    }
    public static void main(String[] args){
        //defining an object of scanner
        // class in order to take input from user
        Scanner obj = new Scanner(System.in);

        Scanner obj1 = new Scanner(System.in);

        //input the string
        System.out.print("Enter the String : ");
        String str = obj1.nextLine();

        System.out.print("Enter the size of the string arraywordList: " );
        // storing it in size using nextInt() function.
        int size = obj.nextInt();
        ArrayList<String> wordList = new ArrayList<>();

        //taking input for the wordList
        System.out.print("Enter word List elements : ");
        for(int i = 0; i < size; i++){
            wordList.add(obj1.nextLine());
        }

        //printing the answer
        System.out.print("String can be divided : " + divided(str, wordList));

    }
}
