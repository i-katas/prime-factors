package com.selonj;

import org.junit.Test;
import static org.junit.Assert.assertThat;
import static org.hamcrest.Matchers.is;
import static org.hamcrest.Matchers.empty;

public class PrimeFactorsTest {
  @Test
  public void noFactors() throws Throwable {
    assertThat(PrimeFactors.of(1), is(empty()));
  }
}
