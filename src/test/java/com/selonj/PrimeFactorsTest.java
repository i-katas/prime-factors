package com.selonj;

import org.junit.Test;
import static org.junit.Assert.assertThat;
import static org.hamcrest.Matchers.is;
import static org.hamcrest.Matchers.empty;
import static org.hamcrest.Matchers.contains;

public class PrimeFactorsTest {
  @Test
  public void noFactors() throws Throwable {
    assertThat(PrimeFactors.of(1), is(empty()));
  }

  @Test
  public void primeNumbers() throws Throwable {
    assertThat(PrimeFactors.of(2), contains(2));
    assertThat(PrimeFactors.of(3), contains(3));
  }

  @Test
  public void compositeNumberContainingDifferentFactors() throws Throwable {
    assertThat(PrimeFactors.of(6), contains(2, 3));
    assertThat(PrimeFactors.of(35), contains(5, 7));
  }

  @Test
  public void compositeNumberContainingSameFactors() throws Throwable {
    assertThat(PrimeFactors.of(4), contains(2, 2));
    assertThat(PrimeFactors.of(8), contains(2, 2, 2));
    assertThat(PrimeFactors.of(9), contains(3, 3));
  }

  @Test(timeout = 500)
  public void bigPrimeNumber() throws Throwable {
    assertThat(PrimeFactors.of(Integer.MAX_VALUE), contains(Integer.MAX_VALUE));
  }
}
