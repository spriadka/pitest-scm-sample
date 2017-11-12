package pitest.scm.sample;

import org.junit.Assert;
import org.junit.Test;

public class DummyClassTest {

    @Test
    public void test() {
        Assert.assertTrue(new DummyClass().amIDumb());
    }
}
