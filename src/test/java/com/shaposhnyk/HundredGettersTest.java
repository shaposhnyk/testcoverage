package com.shaposhnyk;

import static org.hamcrest.CoreMatchers.*;
import static org.hamcrest.MatcherAssert.*;

import java.time.LocalDateTime;

import org.junit.Test;

/**
 * It is good to have an immutable class and a builder.
 * Just it is useless to test it's getters and setters if there is no logic in it
 */
public class HundredGettersTest {

    /**
     * This have very little sense
     */
    @Test
    public void testBuilder() {
        HundredGetters hg = HundredGetters.builder()
                .withId(3L)
                .withEntity("AAA")
                .withCreated(LocalDateTime.MIN)
                .build();

        assertThat(hg.getId(), equalTo(3L));
        assertThat(hg.getEntity(), equalTo("AAA"));
        assertThat(hg.getCreated(), equalTo(LocalDateTime.MIN));
    }

    /**
     * This does not have sense at all
     */
    @Test
    public void testMethods() {
        HundredGetters hg = HundredGetters.of(3L, "AAA");

        assertThat(hg.getId(), equalTo(3L));
        assertThat(hg.getEntity(), equalTo("AAA"));
        assertThat(hg.getCreated(), notNullValue());
    }

}
