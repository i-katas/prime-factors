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
        if (n > 1) {
            primes.add(2);
        }
        return primes;
    }
}
