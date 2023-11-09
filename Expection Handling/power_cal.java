public class power_cal {
    
    static int power(int x, int n){
        if(n==0){
            return 1;
        }
        return (x * power(x, n-1));
    }

    // Logarithumic time complexity
   static int power2(int x, int n){
        if(n==0){
            return 1;
        }
        if(n % 2 == 0){
            return power2(x, n/2) * power2(x, n/2);
        }else{
         return power2(x, n/2) * power2(x, n/2) * x;

        }
    }


 public static void main(String [] args){
    // power menthod output using time complexity: O(n)
     System.out.println(power(15, 5));

     // power2 menthod output using time complexity: O(log(n))
     System.out.println(power2(15, 5));
    }
}