/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author fahmy
 */
public class CYB595_Test {
    
    public CYB595_Test() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    @Test
	public void testMyTrueAssertion() {
		//change true to false to fail the build
		Assert.assertTrue(true);
	}
	
	@Test
	public void demoTest3() {
		Assert.assertEquals( 8, 5+4);
	}
	
	@Test
	public void demoTest4() {
		Assert.assertEquals( 2, 2*1);
	}
    @Test
    public void hello() {
        
    }
}
