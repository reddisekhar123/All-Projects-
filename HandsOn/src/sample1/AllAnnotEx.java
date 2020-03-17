package sample1;

import java.util.ArrayList;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;

public class AllAnnotEx {

	private ArrayList<String>list;
	
	@BeforeClass
	public static void m1() {
		System.out.println("Using @BeforeClass,executed before all test cases");
	}
	@Before
	public void m2() {
		list=new ArrayList<String>();
		System.out.println("Using @BeforeClass annotations,executed before each test cases");
		
		
	}
	@AfterClass
	public static void m3() {
		System.out.println("Using @AfterClass,executed after all test cases");
	}
	@After
	public void m4() {
		System.out.println("Using @AfterClass annotations,executed after each test cases");
	}
}
