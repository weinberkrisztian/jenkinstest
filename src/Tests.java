import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

public class Tests{

    @Test
    public  void test_elso(){
        assertEquals(21,Functions.terulet(3,7));
    }


    @Test
    public  void test_masodik(){
        assertEquals(64,Functions.terulet(8,8));
    }
}
