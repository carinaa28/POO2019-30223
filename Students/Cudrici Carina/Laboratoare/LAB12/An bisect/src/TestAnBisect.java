import static org.junit.Assert.assertTrue;

import junit.framework.TestCase;

public class TestAnBisect extends TestCase {

	public void testAnBisect( )
	{
		
		
		assertTrue(    AnBisect.esteAnBisect(4));
       assertTrue( !  AnBisect.esteAnBisect(203));
		assertTrue( !   AnBisect.esteAnBisect(99));
		assertTrue( !   AnBisect.esteAnBisect(100));
		assertTrue( !  AnBisect.esteAnBisect(200));
		assertTrue( !   AnBisect.esteAnBisect(500));
		assertTrue( !   AnBisect.esteAnBisect(1000));
		assertTrue(     AnBisect.esteAnBisect(1600));
    	assertTrue( !   AnBisect.esteAnBisect(2018));
	}
}
