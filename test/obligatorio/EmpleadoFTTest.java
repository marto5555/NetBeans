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
import java.util.Date;
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
        int expResult = 333;        
        EmpleadoFT instance = new EmpleadoFT("Alan Turin", 11111111, 22222, new Date(2000, 11, 21), expResult,"Arenal", "Vendedor");        
        int result = instance.getTelefono();
        assertEquals(expResult, result);

    }

    /**
     * Test of setTelefono method, of class EmpleadoFT.
     */
    @Test
    public void testSetTelefono() {
        System.out.println("setTelefono");
        int telefono = 7777;
        EmpleadoFT instance = new EmpleadoFT("Alan Turin", 11111111, 22222, new Date(2000, 11, 21),333 ,"Arenal", "Vendedor");
        instance.setTelefono(telefono);        
        int phoneResult = instance.getTelefono();
        assertEquals(telefono, phoneResult);


    }

    /**
     * Test of getDireccionParticular method, of class EmpleadoFT.
     */
    @Test
    public void testGetDireccionParticular() {
        System.out.println("getDireccionParticular");
        String expResult = "Arenal";
        EmpleadoFT instance = new EmpleadoFT("Alan Turin", 11111111, 22222, new Date(2000, 11, 21),333 ,expResult, "Vendedor");        
        String result = instance.getDireccionParticular();
        assertEquals(expResult, result);                
    }

    /**
     * Test of setDireccionParticular method, of class EmpleadoFT.
     */
    @Test
    public void testSetDireccionParticular() {
        System.out.println("setDireccionParticular");               
        EmpleadoFT instance = new EmpleadoFT("Alan Turin", 11111111, 22222, new Date(2000, 11, 21),333 ,"Arenal", "Vendedor");        
        String direccionParticular = "Nuevo Arenal";
        instance.setDireccionParticular(direccionParticular);
        String addressResult = instance.getDireccionParticular();
        assertEquals(direccionParticular, addressResult);        
    }

    /**
     * Test of getTipoEmpleado method, of class EmpleadoFT.
     */
    @Test
    public void testGetTipoEmpleado() {
        System.out.println("getTipoEmpleado");
        String expResult = "Vendedor"; 
        EmpleadoFT instance = new EmpleadoFT("Alan Turin", 11111111, 22222, new Date(2000, 11, 21),333 ,"Arenal", expResult);                
        String result = instance.getTipoEmpleado();
        assertEquals(expResult, result);        
    }

    /**
     * Test of setTipoEmpleado method, of class EmpleadoFT.
     */
    @Test
    public void testSetTipoEmpleado() {
        System.out.println("setTipoEmpleado");        
        EmpleadoFT instance = new EmpleadoFT("Alan Turin", 11111111, 22222, new Date(2000, 11, 21),333 ,"Arenal", "Vendedor");                
        String tipoEmpleado = "Encargado";
        instance.setTipoEmpleado(tipoEmpleado);
        String TypeResult = instance.getTipoEmpleado();
        assertEquals(tipoEmpleado, TypeResult);        
    }

    /**
     * Test del calculo de salario bruto a tipo Vendedor sin superar franja de venta de mes ni horas extra.
     */
    @Test
    public void testCalculaSalarioBrutoTipoVendedor() {
        System.out.println("testCalculaSalarioBrutoTipoVendedor");
        EmpleadoFT instance = new EmpleadoFT("Alan Turin", 11111111, 22222, new Date(2000, 11, 21),333 ,"Arenal", "Vendedor");                
        
        float ventasMes = 5000.0F;
        float horasExtras = 0.0F;  
        TipoEmpleado tipo = new TipoEmpleado(instance.getTipoEmpleado());
        //TODO: El tipo podria sacarlo de la instancia misma.
        //Calculo: base de vendedor - 18000 + 0 Horas extra + 0 de no superar franja
        float result = instance.calculaSalarioBruto(tipo, ventasMes, horasExtras);
        //Resultado : 18000
        assertEquals(result, 18000.0F, 0.0F);
               
    }


    /**
     * Test del calculo de salario bruto a tipo Encargado  sin superar franja de venta de mes ni horas extra.
     */
    @Test
    public void testCalculaSalarioBrutoTipoEncargado() {
        System.out.println("testCalculaSalarioBrutoTipoEncargado");
        EmpleadoFT instance = new EmpleadoFT("Alan Turin", 11111111, 22222, new Date(2000, 11, 21),333 ,"Arenal", "Encargado");                
        
        float ventasMes = 5000.0F;
        float horasExtras = 0.0F;  
        TipoEmpleado tipo = new TipoEmpleado(instance.getTipoEmpleado());
        //TODO: El tipo podria sacarlo de la instancia misma.
        //Calculo: base de encargado - 23000 + 0 Horas extra + 0 de no superar franja
        float result = instance.calculaSalarioBruto(tipo, ventasMes, horasExtras);
        //Resultado : 18000
        assertEquals(result, 23000.0F, 0.0F);               
       
    }

    /**
     * Test del calculo de salario bruto a tipo vendedor superando la primera franja y con 5 horas extra .
     */
    @Test
    public void testCalculaSalarioBrutoTipoVendedorPriemraFranja() {
        System.out.println("testCalculaSalarioBrutoTipoVendedorPriemraFranja");
        EmpleadoFT instance = new EmpleadoFT("Alan Turin", 11111111, 22222, new Date(2000, 11, 21),333 ,"Arenal", "Vendedor");                
        
        float ventasMes = 11000.0F;
        float horasExtras = 5.0F;  
        TipoEmpleado tipo = new TipoEmpleado(instance.getTipoEmpleado());
        //TODO: El tipo podria sacarlo de la instancia misma.
        //Calculo: base de encargado - 18000 + 1500 Horas extra + 1000 de superar franja
        float result = instance.calculaSalarioBruto(tipo, ventasMes, horasExtras);
        //Resultado : 20500
        assertEquals(result, 20500.0F, 0.0F);
               
       
    }

    /**
     * Test del calculo de salario bruto a tipo Encargado superando la segunda franja y con 5 horas extra .
     */
    @Test
    public void testCalculaSalarioBrutoTipoEncargadoSegundaFranja() {
        System.out.println("testCalculaSalarioBrutoTipoEncargadoSegundaFranja");
        EmpleadoFT instance = new EmpleadoFT("Alan Turin", 11111111, 22222, new Date(2000, 11, 21),333 ,"Arenal", "Encargado");                
        
        float ventasMes = 16000.0F;
        float horasExtras = 5.0F;  
        TipoEmpleado tipo = new TipoEmpleado(instance.getTipoEmpleado());
        //TODO: El tipo podria sacarlo de la instancia misma.
        //Calculo: base de encargado - 23000 + 1500 Horas extra + 2000 de superar franja
        float result = instance.calculaSalarioBruto(tipo, ventasMes, horasExtras);
        //Resultado : 26500
        assertEquals(result, 26500.0F,0.0F);
               
    }


    //TODO: Se puede probar otros casos y los nulos a que tire excepcion

    /**
     * Test del calculo de salario Neto a tipo Vendedor sin extras ni franjas .
     */
    @Test
    public void testCalcularSalarioNetoVendedor() {
        System.out.println("testCalcularSalarioNetoVendedor");
        
        EmpleadoFT instance = new EmpleadoFT("Alan Turin", 11111111, 22222, new Date(2000, 11, 21),333 ,"Arenal", "Vendedor");                
        
        float ventasMes = 5000.0F;
        float horasExtras = 0.0F;  
        TipoEmpleado tipo = new TipoEmpleado(instance.getTipoEmpleado());
        //SalarioBruto = 18000
        float salarioBruto = instance.calculaSalarioBruto(tipo, ventasMes, horasExtras);                
        float result = instance.calcularSalarioNeto(salarioBruto);
        //SalarioNetoEsperado = 18000 * 1.16 = 20880
        float expResult = 20880.0F;
        assertEquals(expResult, result, 0.0F);        
    }

    /**
     * Test del calculo de salario Neto a tipo Vendedor Segudna franja .
     */
    @Test
    public void testCalcularSalarioNetoEncargadoSuperaSegundaFranja() {
        System.out.println("testCalcularSalarioNetoEncargadoSuperaSegundaFranja");
        
        EmpleadoFT instance = new EmpleadoFT("Alan Turin", 11111111, 22222, new Date(2000, 11, 21),333 ,"Arenal", "Encargado");                
        
        float ventasMes = 16000.0F;
        float horasExtras = 5.0F;  
        TipoEmpleado tipo = new TipoEmpleado(instance.getTipoEmpleado());
        //SalarioBruto = 26500
        float salarioBruto = instance.calculaSalarioBruto(tipo, ventasMes, horasExtras);                
        float result = instance.calcularSalarioNeto(salarioBruto);
        //SalarioNetoEsperado = 26500 * 1.18 = 31270
        float expResult = 31270.0F;
        assertEquals(expResult, result, 0.0F);        
    }

    /**
     * Test of cantar method, of class EmpleadoFT.
     */
    @Test
    public void testCantar() {
        System.out.println("cantar");
        EmpleadoFT instance = new EmpleadoFT("Alan Turin", 11111111, 22222, new Date(2000, 11, 21),333 ,"Arenal", "Encargado");                
        String expResult = "Letra cancion";
        String result = instance.cantar();
        assertEquals(expResult, result);        
    }
    
}
