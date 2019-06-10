package com.ikatas;

import org.junit.Test;

import static java.lang.Integer.MAX_VALUE;
import static java.util.Arrays.asList;
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

    @Test
    public void compositeNumberThatContainingSameFactors() {
        assertThat(PrimeFactors.of(4), equalTo(asList(2, 2)));
        assertThat(PrimeFactors.of(8), equalTo(asList(2, 2, 2)));
        assertThat(PrimeFactors.of(9), equalTo(asList(3, 3)));
    }

    @Test
    public void compositeNumberThatContainingDiffFactors() {
        assertThat(PrimeFactors.of(6), equalTo(asList(2, 3)));
    }

    @Test(timeout = 500)
    public void performance() {
        assertThat(PrimeFactors.of(MAX_VALUE), equalTo(singletonList(MAX_VALUE)));
    }
}
