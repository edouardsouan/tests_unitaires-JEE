import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by edouard on 22/04/14.
 */
public class TestAbs
{
    @Test
    public void absPositiv()
    {
        ValAbs num = new ValAbs();
        assertEquals(2,num.getValAbs(-2));
    }
}
