/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package obligatorio;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author martin
 */
public class EmpleadoFTTest {
    
    public EmpleadoFTTest() {
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

    /**
     * Test of getTelefono method, of class EmpleadoFT.
     */
    @Test
    public void testGetTelefono() {
        System.out.println("getTelefono");
        EmpleadoFT instance = null;
        int expResult = 0;
        int result = instance.getTelefono();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setTelefono method, of class EmpleadoFT.
     */
    @Test
    public void testSetTelefono() {
        System.out.println("setTelefono");
        int telefono = 0;
        EmpleadoFT instance = null;
        instance.setTelefono(telefono);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getDireccionParticular method, of class EmpleadoFT.
     */
    @Test
    public void testGetDireccionParticular() {
        System.out.println("getDireccionParticular");
        EmpleadoFT instance = null;
        String expResult = "";
        String result = instance.getDireccionParticular();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setDireccionParticular method, of class EmpleadoFT.
     */
    @Test
    public void testSetDireccionParticular() {
        System.out.println("setDireccionParticular");
        String direccionParticular = "";
        EmpleadoFT instance = null;
        instance.setDireccionParticular(direccionParticular);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getTipoEmpleado method, of class EmpleadoFT.
     */
    @Test
    public void testGetTipoEmpleado() {
        System.out.println("getTipoEmpleado");
        EmpleadoFT instance = null;
        String expResult = "";
        String result = instance.getTipoEmpleado();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setTipoEmpleado method, of class EmpleadoFT.
     */
    @Test
    public void testSetTipoEmpleado() {
        System.out.println("setTipoEmpleado");
        String tipoEmpleado = "";
        EmpleadoFT instance = null;
        instance.setTipoEmpleado(tipoEmpleado);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of calculaSalarioBruto method, of class EmpleadoFT.
     */
    @Test
    public void testCalculaSalarioBruto() {
        System.out.println("calculaSalarioBruto");
        TipoEmpleado tipo = null;
        float ventasMes = 0.0F;
        float horasExtras = 0.0F;
        EmpleadoFT instance = null;
        float expResult = 0.0F;
        float result = instance.calculaSalarioBruto(tipo, ventasMes, horasExtras);
        assertEquals(expResult, result, 0.0);
       
    }

    /**
     * Test of calcularSalarioNeto method, of class EmpleadoFT.
     */
    @Test
    public void testCalcularSalarioNeto() {
        System.out.println("calcularSalarioNeto");
        float salarioBruto = 0.0F;
        EmpleadoFT instance = null;
        float expResult = 0.0F;
        float result = instance.calcularSalarioNeto(salarioBruto);
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of cantar method, of class EmpleadoFT.
     */
    @Test
    public void testCantar() {
        System.out.println("cantar");
        EmpleadoFT instance = null;
        String expResult = "";
        String result = instance.cantar();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
