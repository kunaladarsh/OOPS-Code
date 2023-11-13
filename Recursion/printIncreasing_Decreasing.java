class printIncrasing_Decreasing{

    public static void funPrintInDe(int n){
        if(n==0){
            return;
        }
        System.out.println(n);
        funPrintInDe(n-1);
        System.out.println(n);
    }

 public static void main(String [] args){
     funPrintInDe(10);
    }
}