package com.ikatas;

import java.util.ArrayList;
import java.util.List;

/**
 * @author xiaoliang
 * @since 2019-06-10
 */
public class PrimeFactors {
    public static List<Integer> of(int n) {
        List<Integer> primes = new ArrayList<>();
        for (int candidate = 2; candidate <= Math.sqrt(n); candidate++) {
            while (n % candidate == 0) {
                primes.add(candidate);
                n /= candidate;
            }
        }
        if (n > 1) {
            primes.add(n);
        }
        return primes;
    }
}
