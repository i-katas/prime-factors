package com.ikatas;

import org.junit.Test;

import static java.util.Collections.emptyList;
import static java.util.Collections.singletonList;
import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

/**
 * @author xiaoliang
 * @since 2019-06-10
 */
public class PrimeFactorsTest {
    @Test
    public void noFactors() {
        assertThat(PrimeFactors.of(1), is(emptyList()));
    }

    @Test
    public void primeNumbers() {
        assertThat(PrimeFactors.of(2), equalTo(singletonList(2)));
        assertThat(PrimeFactors.of(3), equalTo(singletonList(3)));
    }
}
