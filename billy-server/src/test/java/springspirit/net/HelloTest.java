package springspirit.net;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;


/**
 * Created by grange on 2016. 9. 23..
 */
public class HelloTest {
    @Test
    public void dummy() {
        assertThat("OK", is("OK"));
    }

    @Test
    public void dummy2()
    {
        assertThat("Error", is("Error"));
    }
}
