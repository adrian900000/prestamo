/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prestamo;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author adria
 */
public class PrestamoTestCLases {
    
    public PrestamoTestCLases() {
    }
    
    @BeforeClass
    public static void beforeclass(){
         Prestamo instance = new Prestamo();
    }
    
    @AfterClass
    public static void tearDownClass() {
         instance.clear(); }
    
    @Before
    public void setUp() {
        
    }
    
    @After
    public void tearDown() {
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}

 /**
     * Test of main method, of class Prestamo.
     */
    @Test
    public void testMain() {
        System.out.println("");
        String[] args = null;
        Prestamo.main(args);
        // TODO review the generated test code and remove the default call to fail.
        
    }
       @Test
    public void testMain() {
        System.out.println("");
        String[] args = null;
        Prestamo.main(args);
        // TODO review the generated test code and remove the default call to fail.
        
    }

    /**
     * Test of estudio method, of class Prestamo.
     */
    @Test
    public void testEstudio() {
        System.out.println("caso1.1");
        int cantidad = 1000;
       
        String expResult = "Felicidades, préstamo concedido";
        String result = instance.estudio(cantidad);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
       
    }
       @Test
    public void testEstudio() {
        System.out.println("caso1.2");
        int cantidad = 15000;
        
        String expResult = "Felicidades, préstamo concedido";
        String result = instance.estudio(cantidad);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
       
    }
    
}
