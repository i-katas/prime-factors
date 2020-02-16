package com.selonj;

import java.util.List;
import java.util.ArrayList;

public class PrimeFactors {
  public static List<Integer> of(int n) {
    List<Integer> primes = new ArrayList<>();
    for(int m = 2; n > 1; m++) {
      while(n % m == 0) {
        primes.add(m);
        n /= m;
      }
    }
    return primes;
  }
}
