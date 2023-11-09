import java.util.Scanner;

public class Zig_ZagPatternDisplay {
    static void displaypattern(int n){
        if(n==0){
            return;
        }
        System.out.print(n + " ");
        displaypattern(n-1);
        System.out.print(n+ " ");
        displaypattern(n-1);
        System.out.print(n + " ");
        
    }

    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int n = sc.nextInt();
            if(n < 0){
                throw new ArithmeticException("Enter the number above 0");
            }
            displaypattern(n);
        }catch(Exception e){
            System.out.println(e);
            System.out.println("Occurs error");
        }
    }
}
