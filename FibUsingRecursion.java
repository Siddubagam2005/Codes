public class FibUsingRecursion {
    public static void main(String[] args) {
        // 0 1 1 2 3 5 8 13 21
         //0 1 2 3 4 5 6  7  8(indexes)
        int ans = fibo(2);
        System.out.println(ans);
    }

    static int fibo(int n) {
        if (n < 2) {
            return n;
        }
        return fibo(n - 1) + fibo(n - 2);
    }
}
