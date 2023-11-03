import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PlaneTest {

    Plane plane;

    @Before
    public void before() {
        plane = new Plane(PlaneType.BOEING747);
    }

    @Test
    public void getPlaneType(){
        assertEquals(PlaneType.BOEING747, plane.getPlaneType());
    }

    @Test
    public void getPlaneName(){
        assertEquals("Boeing 747", PlaneType.BOEING747.getPlaneName());
    }

    @Test
    public void getCapacity(){
        assertEquals(474, PlaneType.BOEING747.getCapacity());
    }

    @Test
    public void getWeight(){
        assertEquals(747000, PlaneType.BOEING747.getWeight());
    }
}
