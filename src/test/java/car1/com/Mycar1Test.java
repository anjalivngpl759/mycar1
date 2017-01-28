/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package car1.com;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author anjal
 */
public class Mycar1Test {
    Car ca;
    
    public Mycar1Test() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
        ca = new Car();
    }
    
    @After
    public void tearDown() {
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    @Test
    public void color() {
    ca.setColor("blue");
    assertEquals("blue",ca.getColor());
            
    }
     public void make() {
    ca.setMake("Nissan");
    assertEquals("Nissan",ca.getMake());
            
    }
     @Test
      public void model() {
    ca.setModel("Sentra");
    assertEquals("Sentra",ca.getModel());
            
    }
      @Test
       public void vin() {
    ca.setVin(3451);
    assertEquals(3451,ca.getVin());
            
    }
}
