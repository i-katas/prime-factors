package com.selonj;

import java.util.List;
import java.util.ArrayList;

public class PrimeFactors {
  public static List<Integer> of(int n) {
    List<Integer> primes = new ArrayList<>();
    if(n > 1) {
      if(n % 2 == 0) {
        primes.add(2);
        n /= 2;
      }
      if(n > 1) {
        primes.add(n);
      }
    }
    return primes;
  }
}
