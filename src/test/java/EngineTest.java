
import Vehicles.Components.Engine;
import org.junit.Before;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class EngineTest {

    Engine engine;

    @Before
    public void setUp(){
        engine = new engine(3.6, "Electric" );
    }

    @Test
    public void hasSize(){
        assertEquals(3.6, engine.getSize());
    }

}
