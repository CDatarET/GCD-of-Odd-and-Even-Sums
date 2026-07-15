class Solution {
    private int gcd(int min, int max){
        for(int i = min; i >= 1; i--){
            if(min % i == 0 && max % i == 0){
                return i;
            }
        }

        return -1;
    }

    public int gcdOfOddEvenSums(int n) {
        int sumOdd = 0;
        int sumEven = 0;
        for(int i = 1; i < 2 * n; i += 2){
            sumOdd += i;
            sumEven += i + 1;
        }

        return gcd(Math.min(sumOdd, sumEven), Math.max(sumOdd, sumEven));
    }
}
