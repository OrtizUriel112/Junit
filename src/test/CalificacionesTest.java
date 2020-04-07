package test;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import calificaciones.Calificaciones;

public class CalificacionesTest {

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testCalificacionesCase1() {
		System.out.println("Checar Calificaciones");
		int numero = 60;
		Calificaciones calificacion = new Calificaciones();
		int expResult = 75;
		int result = calificacion.calificacion(numero);
        assertEquals(expResult, result);
	}
	
	@Test
	public void testCalificacionesCase2() {
		System.out.println("Checar Calificaciones");
		int numero = 85;
		Calificaciones calificacion = new Calificaciones();
		int expResult = 85;
		int result = calificacion.calificacion(numero);
        assertEquals(expResult, result);
	}
	
	@Test
	public void testCalificacionesCase3() {
		System.out.println("Checar Calificaciones");
		int numero = 50;
		Calificaciones calificacion = new Calificaciones();
		int expResult = 80;
		int result = calificacion.calificacion(numero);
        assertEquals(expResult, result);
	}
	
	@Test
	public void testCalificacionesCase4() {
		System.out.println("Checar Calificaciones");
		int numero = 10;
		Calificaciones calificacion = new Calificaciones();
		int expResult = 96;
		int result = calificacion.calificacion(numero);
        assertEquals(expResult, result);
	}
	
	@Test
	public void testCalificacionesCase5() {
		System.out.println("Checar Calificaciones");
		int numero = 99;
		Calificaciones calificacion = new Calificaciones();
		int expResult = 99;
		int result = calificacion.calificacion(numero);
        assertEquals(expResult, result);
	}

}
