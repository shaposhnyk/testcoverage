package com.shaposhnyk;

import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.junit.Assert.assertThat;

/**
 * Here we have a 100%-covered code, because we must do so
 * <p>
 * However, there are at least potential
 * - {@link NullPointerException}
 * - {@link ArrayIndexOutOfBoundsException}
 * - and some other problems, which are not specified in class contracts
 */
public class HundredTest {

    @Before
    public void before() throws Exception {
        doInitSomeJeeStuff(); // this is useless for these tests, but it make program looks big
    }

    public void after() throws Exception {
        doTeardownSomeJeeStuff(); // anyway corporate policy encourage us to mindlessly apply these practices
    }

    private void doInitSomeJeeStuff() throws InterruptedException {
        Thread.sleep(100L); // will eat some time
        // we can setup in-memory-DB connection and fill it with 1GB of data just because other tests do so
    }

    private void doTeardownSomeJeeStuff() throws Exception {
        Thread.sleep(100L); // and obviously we will add throws clause as it make program looks serious
    }

    @Test
    public void getEntity() {
        String xxx = "XXX";
        assertThat(new Hundred(xxx).getEntity(), equalTo(xxx));
    }

    @Test
    public void compute1() { // do something simple - this will 100% code coverage
        Hundred hundred = new Hundred("xxx");
        assertThat(hundred.compute("abcdef/gh"), equalTo("ef"));
    }

    @Test
    public void compute2() { // it is the same as c1, just we like to modify unrelated
        Hundred hundred = new Hundred("abc");
        assertThat(hundred.compute("abcdef/gh"), equalTo("ef"));
    }

    @Test
    public void compute3() { // and we should use mockito in our tests
        Hundred hundred = new Hundred("xxx");
        assertThat(hundred.compute("abcdef/gh"), equalTo("ef"));
    }

    @Test
    public void compute4() { // it is the same as c1, but corporate policy oblige us to have at least 5 tests per class
        Hundred hundred = new Hundred("xxx");
        assertThat(hundred.compute("abcdef/gh"), equalTo("ef"));
    }

    @Test
    public void compute5() { // it is the same as c1, but corporate policy oblige us to have at least 5 tests per class
        Hundred hundred = new Hundred("xxx");
        assertThat(hundred.compute("abcdef/gh"), equalTo("ef"));
    }
}