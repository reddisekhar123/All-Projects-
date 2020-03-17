package sample1;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;

public class PrepareMyBagTest {

	FirstDayAtSchool school;
	String[] bag= {"Records","NoteBooks","Mobiles"};
	@Before
	public void setUp() throws Exception{
		System.out.println("Initializing");
		school =new FirstDayAtSchool();
		
	}
	@Test
	public void testPrepareMyBag(){
		System.out.println("Inside testPrepareMyBag()");
		assertArrayEquals(bag,school.prepareMyBag());
	
}
	
	@Test
	public void testCheckMyName(){
		System.out.println("Inside test check my name()");
		school.checkmyName("Sanju");
		assertTrue(school.res);
	}
}