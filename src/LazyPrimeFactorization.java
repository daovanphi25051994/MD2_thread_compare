public class LazyPrimeFactorization implements Runnable {
    @Override
    public void run(){
        long start = System.currentTimeMillis();
        for (int i = 2; i <= 10000; i++){
            if (isPrime(i)){
                System.out.println(i);
            }
        }
        long end = System.currentTimeMillis();
        System.out.println("method run is "+ (end - start) + " milliseconds");
    }
    public boolean isPrime(int number){
        if (number <= 1){
            return false;
        }else {
            for (int i = 2; i < number; i++){
                if (number % i == 0){
                    return false;
                }
            }
            return true;
        }
    }
}
