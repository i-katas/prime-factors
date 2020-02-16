package com.selonj;

import java.util.List;
import java.util.ArrayList;

public class PrimeFactors {
  public static List<Integer> of(int n) {
    List<Integer> primes = new ArrayList<>();
    int m = 2;
    if(n > 1) {
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
