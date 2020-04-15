public class Test {
    public static void main(String[] args) {
        LazyPrimeFactorization lazyPrimeFactorization = new LazyPrimeFactorization();
        OptimizedPrimeFactorization optimizedPrimeFactorization = new OptimizedPrimeFactorization();
        Thread lazyThread = new Thread(lazyPrimeFactorization);
        Thread optimize = new Thread(optimizedPrimeFactorization);
        lazyThread.start();
        try {
            lazyThread.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        optimize.start();
    }
}
