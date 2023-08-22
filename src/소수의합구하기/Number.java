package 소수의합구하기;

public class Number {
    private int n;

    Number(){}

    Number(int n) {
        this.n = n;
    }
    public int primeNum(int n) {
        boolean isPrime = true;
        for(int i = 2; i < n ; i++){
            if(n % i == 0) isPrime = false;
        }
        if(isPrime) return n;
        else return 0;
    }

    public void getPrimeSum() {
        int sum = 0;
        for(int i = 2; i < n; i++) sum += primeNum(i);
        System.out.println(sum);
    }


}
