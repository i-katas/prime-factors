package com.selonj;

import java.util.List;
import java.util.ArrayList;

public class PrimeFactors {
  public static List<Integer> of(int n) {
    List<Integer> primes = new ArrayList<>();
    int m = 2;
    while(n > 1) {
      while(n % m == 0) {
        primes.add(m);
        n /= m;
      }
      m++;
    }
    return primes;
  }
}
