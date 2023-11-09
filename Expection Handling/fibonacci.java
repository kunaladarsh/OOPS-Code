import java.util.Scanner;

class fibonacci{
    static int fib(int n){
        if(n==1){
            return 1;
        }
        if(n==2){
            return 1;
        }
        return fib(n-1) + fib(n-2); 
    }
    
    public static void main(String [] args){
        try (Scanner sc = new Scanner(System.in)) {
             int n = sc.nextInt();
             System.out.println(fib(n));
    } catch(Exception e){
        System.out.println(e);
    } finally{
        System.out.println("code be executed");
    }
  }
}