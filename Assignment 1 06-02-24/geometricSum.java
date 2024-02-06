import java.util.Scanner;

public class geometricSum {


    //function to calculate geometric sum
    public double geoSum(int k){
        //base case when k becomes 0 return 1
        if(k == 0){
            return 1;
        }
        //adding the value with current k and calling the function for k-1
        return ((double)(1/Math.pow(2,k))) + geoSum(k-1);
    }

    //main function
    public static void main(String[] args){
        //defining an object of scanner
        // class in order to take input from user
        Scanner obj = new Scanner(System.in);

        System.out.print("Enter the k : ");

        //taking the value from the user and
        // storing it in k using nextInt() function.
        int k = obj.nextInt();

        //object of geometric class to access
        // non-static members of the class
        geometricSum g = new geometricSum();

        //printing the geometric sum
        System.out.print("Geometric Sum : " + g.geoSum(k));
    }
}
