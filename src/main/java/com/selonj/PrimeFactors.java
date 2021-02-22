package com.selonj;

import java.util.List;
import java.util.ArrayList;

public class PrimeFactors {
  public static List<Integer> of(int n) {
    List<Integer> primes = new ArrayList<>();
    while(n % 2 == 0) {
        primes.add(2);
        n /= 2;
    }

    for(int m = 3; m <= Math.sqrt(n); m += 2) {
      while(n % m == 0) {
        primes.add(m);
        n /= m;
      }
    }

    if(n > 1) {
      primes.add(n);
    }
    return primes;
  }
}
