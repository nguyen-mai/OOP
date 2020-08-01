package Week3.task1;

public class Week3Task1 {
    // compute greatest common divisor of $a and $b
    public int gcd(int a, int b) {
        while (a != b) {
        	if(a > b)
                a = a - b;
            else
                b = b - a;
        }
        return b;        
    }

    // compute the fibonacci of $n
    public int fibonacci(int n) {
        if (n == 1)
            return 1;
        if (n == 2)
            return 1;
        return fibonacci(n - 1) + fibonacci(n - 2);
    }

    /**
     * print all prime numbers from 0 to $n use Sieve of Eratosthenes algorithm
     * useful link https://en.wikipedia.org/wiki/Sieve_of_Eratosthenes notice that
     * print each number in a line
     * 
     * @param n
     */
    public void sieveEratosthenes(int n) {
        final boolean[] check = new boolean[n + 1];
        // Khởi tạo tất cả các số [2...N] đều là số nguyên tố
        for (int i = 2; i <= n; i++) {
            check[i] = true;
        }
        // Thuật toán sàng nguyên tố
        // Nếu một số là số nguyên tố, thì tất cả các bội của nó không phải số nguyên tố
        for (int i = 2; i <= n; i++) {
            if (check[i] == true) {
                for (int j = 2 * i; j <= n; j += i) {
                    check[j] = false;
                }
            }
        }
        // In ra các số là số nguyên tố
        for (int i = 2; i <= n; i++) {
            if (check[i] == true) {
                System.out.print(i + " ");
            }
        }
    }
}
