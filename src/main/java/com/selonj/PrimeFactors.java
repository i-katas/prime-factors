package com.selonj;

import java.util.List;
import java.util.ArrayList;

public class PrimeFactors {
  public static List<Integer> of(int n) {
    List<Integer> primes = new ArrayList<>();
    for(int m = 2; m <= Math.sqrt(n); m++) {
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
