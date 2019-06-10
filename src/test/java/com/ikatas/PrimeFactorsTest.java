package com.ikatas;

import org.junit.Test;

import static java.util.Collections.emptyList;
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
}
