import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SingletonTest {
    @Test
    public void somethingIsDoneWithAbcIsSetAsASystemProperty(){
        Singleton singleton = Singleton.getInstance();
        assertEquals(singleton.getSomething(), "something");
    }
}
