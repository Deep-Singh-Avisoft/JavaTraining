//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        System.out.println("Pattern 1");

        for(int i = 0; i < 4; i ++){
            for(int j = 1; j <= 4; j++){
                System.out.print(j);
            }
            System.out.println();
        }

        System.out.println();

        System.out.println("Pattern 2");
        for(int i = 1; i <= 4; i++){
            for(int j = 0; j < i; j++){
                System.out.print(j+1);
            }
            System.out.println();
        }

        System.out.println();

        System.out.println("Pattern 3");
        for(int i = 1; i <= 4; i++){
            for(int j = 0; j < i; j++){
                System.out.print(i);
            }
            System.out.println();
        }
    }
}