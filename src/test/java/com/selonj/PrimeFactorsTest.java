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
  }
}
