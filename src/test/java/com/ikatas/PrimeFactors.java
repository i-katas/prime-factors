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
        int candidate = 2;
        while (candidate < n) {
            while (n % candidate == 0) {
                primes.add(candidate);
                n /= candidate;
            }
            candidate++;
        }
        if (n > 1) {
            primes.add(n);
        }
        return primes;
    }
}
