class fibonacci{
    public static void main(String[] args) {
        int n = 10;
        System.out.println("Fibonacci series up to " + n + " terms:");
        printFiboSeries(n);
    }
    
    
    static void printFiboSeries(int n) {
        for(int i = 0; i < n; i++) {
            System.out.print(fibo(i) + " ");
        }
        System.out.println(); 
    }
    
   
    static int fibo(int n) {
        if(n < 2) {
            return n;
        }
        return fibo(n-1) + fibo(n-2);
    }
}