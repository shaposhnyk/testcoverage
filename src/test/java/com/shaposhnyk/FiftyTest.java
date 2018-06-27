package com.shaposhnyk;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.junit.Assert.assertThat;

public class FiftyTest {
    @Test
    public void computeDegenerateCases() {
        Fifty fifty = Fifty.of(Integer.valueOf(10));

        assertThat(fifty.compute(null), equalTo(""));
        assertThat(fifty.compute(""), equalTo(""));
        assertThat(fifty.compute("A"), equalTo(""));
        assertThat(fifty.compute("AB"), equalTo(""));
        assertThat(fifty.compute("ABC"), equalTo(""));
        assertThat(fifty.compute("ABCZ"), equalTo("bbb"));
        assertThat(fifty.compute("A/BCD"), equalTo("aaa"));
    }

    @Test
    public void allAfterSlashIsRemoved() {
        Fifty fifty = Fifty.of(Integer.valueOf(10));

        assertThat(fifty.compute("ABCD/EFG"), equalTo("ABCD"));
        assertThat(fifty.compute("ABCD/EF/G"), equalTo("ABCD/EF"));
    }
}