import java.util.Scanner;

public class totalStrings {

    static int countStrings(int n, int bCnt, int cCnt){

        if(bCnt < 0 || cCnt < 0){
            return 0;
        }
        if(n == 0) return 1;
        if(bCnt == 0 && cCnt == 0){
            return 1;
        }

        int res = countStrings(n - 1, bCnt, cCnt) ;
        res += countStrings(n - 1, bCnt - 1, cCnt);
        res += countStrings(n - 1, bCnt, cCnt - 1);

        return res;
    }

    public static void main(String[] args){
        System.out.print("Enter n : ");
        Scanner obj = new Scanner(System.in);
        int n = obj.nextInt();

        System.out.print("Total strings : " + countStrings(n, 1, 2));
    }
}
